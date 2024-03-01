package org.App.Entites;

public  class HistoricoMensagem extends Historico {
    private String _numero;
    private String _mensagem;

    public HistoricoMensagem(String mensagem, String numero){
        this._numero = mensagem;
        this._mensagem = numero;
    }

    public String getNumero() {
        return this._numero;
    }

    public void setNumero(String numero) {
        this._numero = numero;
    }

    public String getMensagem() {
        return this._mensagem;
    }

    public void setMensagem(String mensagem) {
        this._mensagem = mensagem;
    }

    @Override
    public String toString(){
        return "Id: " + this.getId() + " Mensagem: " + this._mensagem + " Mensagem enviada para : " + this._numero + " Data registro: " + this.getDataRegistro();
    }
}