
package ANNOTATIONS.CRUD;

import ANNOTATIONS.Autenticacao;
import org.hibernate.Query;
import org.hibernate.Session;


public class AutenticacaoCRUD{
    
    private Session sessao;
    

    public void setSession(Session sessao){
      this.sessao = sessao;
    }
    

    public void salvar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void atualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean autenticar(Autenticacao autenticacao){
        Query consulta = sessao.createQuery("from Autenticacao where login = :loginParametro and senha = :senhaParametro");
        consulta.setString("loginParametro", autenticacao.getLogin());
        consulta.setString("senhaParametro", autenticacao.getSenha());
        return consulta.uniqueResult() != null;
    }


}
