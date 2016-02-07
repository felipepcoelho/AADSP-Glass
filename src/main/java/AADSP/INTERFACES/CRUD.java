
package AADSP.INTERFACES;

import org.hibernate.Session;

public interface CRUD {
    public void setSession(Session sessao);
    public void salvar(Object obj);
    public void atualizar(Object obj);
    public void excluir(Object obj);
}
