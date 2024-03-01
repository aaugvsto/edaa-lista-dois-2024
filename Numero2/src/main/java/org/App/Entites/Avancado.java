package org.App.Entites;

import java.util.ArrayList;
import java.util.List;

import org.App.Entites.Base.Celular;

interface IAvancado {
    public void exibirHistoricoDeLigacoes();
    public void exibirHistoricoDeMensagens();
}

public class Avancado extends Celular implements IAvancado{

    public List<HistoricoLigacao> historicoLigacoes;
    public List<HistoricoMensagem> historicoMensagens;

    public Avancado(){
        this.historicoLigacoes = new ArrayList<HistoricoLigacao>();
        this.historicoMensagens = new ArrayList<HistoricoMensagem>();
    }

    @Override
    public void ligar() {
        System.out.println("Celular avançado ligado.\n");
    }

    @Override
    public void desligar() {
        System.out.println("Celular avançado desligado.\n");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligação para o número:" + numero + "com celular básico realizada com sucesso.\n");
        this.armazenaHistorioLigacao(numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mensagem: '" + mensagem + "' enviada para o número " + numero + " com sucesso.\n");
        this.armazenaHistorioMensagem(mensagem, numero);
    }

    @Override
    public void exibirHistoricoDeLigacoes(){
        System.out.println(historicoLigacoes.toString());
    }

    @Override
    public void exibirHistoricoDeMensagens(){
        System.out.println(historicoMensagens.toString());
    }

    private void armazenaHistorioLigacao(String numero) {
        this.historicoLigacoes.add(new HistoricoLigacao(numero));
    }

    private void armazenaHistorioMensagem(String mensagem, String numero) {
        this.historicoMensagens.add(new HistoricoMensagem(mensagem, numero));
    }
}

