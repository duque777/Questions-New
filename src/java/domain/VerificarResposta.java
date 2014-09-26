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
public class VerificarResposta {
    
    private Resposta resposta;
    private String motivo;
    private Usuario usuario;
    private Date dtVerifica;
    private String motivoResposta;
    private Usuario usuarioResposta;
    private Date dtResposta;

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDtVerifica() {
        return dtVerifica;
    }

    public void setDtVerifica(Date dtVerifica) {
        this.dtVerifica = dtVerifica;
    }

    public String getMotivoResposta() {
        return motivoResposta;
    }

    public void setMotivoResposta(String motivoResposta) {
        this.motivoResposta = motivoResposta;
    }

    public Usuario getUsuarioResposta() {
        return usuarioResposta;
    }

    public void setUsuarioResposta(Usuario usuarioResposta) {
        this.usuarioResposta = usuarioResposta;
    }

    public Date getDtResposta() {
        return dtResposta;
    }

    public void setDtResposta(Date dtResposta) {
        this.dtResposta = dtResposta;
    }
    
    
    
}
