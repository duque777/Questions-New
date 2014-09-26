/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.Conexao;
import domain.Usuario;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ORCS
 */

@ManagedBean()
@SessionScoped()

public class LoginController {
    
    private Usuario usuario = new Usuario();

    public LoginController() {
    }
    
    public void logar() throws IOException{
        System.out.println("here test");
        Conexao conexao = new Conexao();
        Usuario user = new Usuario();
        user = conexao.validateUser(usuario);
        if(user.getIdUsuario()>0)
        {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        session.setAttribute("usuario", user);
        usuario = new Usuario();
        FacesContext.getCurrentInstance().getExternalContext().redirect("questions.jsf");
        }else{
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.jsf"); 
        }
        
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
        
    
}
