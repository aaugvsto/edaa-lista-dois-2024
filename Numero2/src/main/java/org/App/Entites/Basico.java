package org.App.Entites;

import org.App.Entites.Base.Celular;

public class Basico extends Celular {
    @Override
    public void ligar() {
        System.out.println("Celular básico ligado.\n");
    }

    @Override
    public void desligar() {
        System.out.println("Celular básico desligado.\n");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligação para o número:" + numero + "com celular básico realizada com sucesso.\n");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Mensagem: " + mensagem + " enviado para o número " + numero + " com sucesso.\n");
    }
}
