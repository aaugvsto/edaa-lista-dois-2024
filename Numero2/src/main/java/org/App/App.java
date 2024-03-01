package org.App;

import org.App.Entites.Avancado;
import org.App.Entites.Basico;

public class App {
    public static void main(String[] args) {

        Basico celularBasico = new Basico();

        celularBasico.ligar();

        celularBasico.fazerLigacao("(31)98653-0000");
        celularBasico.fazerLigacao("(31)98653-0001");
        celularBasico.fazerLigacao("(31)98653-0002");

        celularBasico.enviarMensagem("(31)98653-0000", "Oi, tudo bem?");
        celularBasico.enviarMensagem("(31)98653-0001", "Oi, tudo bem?");
        celularBasico.enviarMensagem("(31)98653-0002", "Oi, tudo bem?");

        celularBasico.desligar();

        Avancado celularAvancado = new Avancado();

        celularAvancado.ligar();

        celularAvancado.fazerLigacao("(31)98653-0000");
        celularAvancado.fazerLigacao("(31)98653-0001");
        celularAvancado.fazerLigacao("(31)98653-0002");

        celularAvancado.exibirHistoricoDeLigacoes();

        celularAvancado.enviarMensagem("(31)98653-0000", "Oi, tudo bem?");
        celularAvancado.enviarMensagem("(31)98653-0001", "Oi, tudo bem?");
        celularAvancado.enviarMensagem("(31)98653-0002", "Oi, tudo bem?");

        celularAvancado.exibirHistoricoDeMensagens();

        celularAvancado.desligar();
    }
}