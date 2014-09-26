/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author ORCS
 */
public class Resposta {
    
    private String resposta;
    private Pergunta pergunta;
    private int idResposta;
    private Usuario usuario;
    private int avaliacao;
    private int qtdAvaliacao;
    private Date dtResposta;

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public int getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(int idResposta) {
        this.idResposta = idResposta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public Date getDtResposta() {
        return dtResposta;
    }

    public void setDtResposta(Date dtResposta) {
        this.dtResposta = dtResposta;
    }
    
}
