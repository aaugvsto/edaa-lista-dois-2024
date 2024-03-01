package org.App.Entites;

public  class HistoricoLigacao extends Historico {
    private String _numeroLigacao;

    public HistoricoLigacao(String numeroLigacao){
        this._numeroLigacao = numeroLigacao;
    }

    public String getNumeroLigacao() {
        return _numeroLigacao;
    }

    public void setNumeroLigacao(String numeroLigacao) {
        this._numeroLigacao = numeroLigacao;
    }

    @Override
    public String toString(){
        return "Id: " + this.getId() + " Número da ligação: " + this._numeroLigacao + " Data registro: " + this.getDataRegistro();
    }
}