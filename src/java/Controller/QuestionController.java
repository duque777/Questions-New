/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Categoria;
import domain.Pergunta;
import domain.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ORCS
 */

@ManagedBean()
public class QuestionController {
    
    private Pergunta pergunta;
    private ArrayList<Pergunta> perguntas;
    private ArrayList<Categoria> categorias;
    private Usuario usuario;


    public QuestionController() throws IOException {
    
    pergunta = new Pergunta();
    perguntas = new ArrayList<>();
    categorias = new ArrayList<>();
    
    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    usuario = (Usuario) session.getAttribute("usuario");
    
    
    Pergunta p = new Pergunta();
        p.setAnswers(5);
        p.setTitulo("Como funciona MIDAS WEB");
        
        perguntas.add(p);
        
        p = new Pergunta();
        p.setAnswers(2);
        p.setTitulo("O que O que e");
        perguntas.add(p);
    
        Categoria cat = new Categoria();
        cat.setCategoria("JAVA");
        cat.setIdCategoria(1);
        categorias.add(cat);
        cat = new Categoria();
        cat.setCategoria("C#");
        cat.setIdCategoria(2);
        categorias.add(cat);
        cat = new Categoria();
        cat.setCategoria("MIDAS");
        cat.setIdCategoria(3);
        categorias.add(cat);
     if(!(usuario.getIdUsuario() > 0))
    {
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.jsf");
    }
    
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    
    public void saveQuestion(){
        System.out.println(pergunta.getCategoria());
        perguntas.add(pergunta);
    }

    public void viewQuestion(Pergunta perg){
        pergunta = perg;
    }
    
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public ArrayList<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }
    
    
    
    
    
}
