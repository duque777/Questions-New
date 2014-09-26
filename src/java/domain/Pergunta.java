/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ORCS
 */
public class Pergunta {
    
    private String titulo;
    private int idPergunta;
    private int idCategoria;
    private String pergunta;
    private Usuario usuario;
    private Categoria categoria;
    private Date dtPergunta;
    private boolean fechado;
    private int avaliacao;
    private int qtdAvaliacao;
    private int answers;

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDtPergunta() {
        return dtPergunta;
    }

    public void setDtPergunta(Date dtPergunta) {
        this.dtPergunta = dtPergunta;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQtdAvaliacao() {
        return qtdAvaliacao;
    }

    public void setQtdAvaliacao(int qtdAvaliacao) {
        this.qtdAvaliacao = qtdAvaliacao;
    }
    
}
