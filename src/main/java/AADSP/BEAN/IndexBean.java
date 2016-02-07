package AADSP.BEAN;

import AADSP.ANNOTATTIOS.Autenticacao;
import AADSP.ANNOTATTIOS.CRUD.AutenticacaoCRUD;
import AADSP.UTILS.BaseBean;
import AADSP.UTILS.HibernateUtil;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean(name="indexBean")
public class IndexBean extends BaseBean
{
    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public void autenticar() throws IOException
    {
        AutenticacaoCRUD crud = new AutenticacaoCRUD();
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.setLogin(login);
        autenticacao.setSenha(senha);
        crud.setSession(HibernateUtil.getSessionFactory().openSession());
        if(crud.autenticar(autenticacao))
            FacesContext.getCurrentInstance().getExternalContext().redirect("/menuPrincipal/controller.html");
        else{
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage( FacesMessage.SEVERITY_WARN,"ACESSO NEGADO",  "Não foi possivel autenticar o usuário com os dados informados") );

        }
    }
    
    private static final long serialVersionUID = 5585493974059809141L;
    private String login;
    private String senha;
}
