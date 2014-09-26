/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.Conexao;
import domain.Categoria;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ORCS
 */

@ManagedBean()
public class CategoriaController {
    
    private Categoria categoria;
    private ArrayList<Categoria> categorias;

    public CategoriaController() {
    
        categoria = new Categoria();
        categorias = new ArrayList<>();
        
        Conexao conexao = new Conexao();
        categorias = conexao.selectCategory();
        
        /*
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
        */
     
    
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public void addCategoria()
    {
        Conexao con = new Conexao();
        con.insertCategory(categoria);
        categorias.add(categoria);
        categoria = new Categoria();
    }
    
    
    
    
    
}
