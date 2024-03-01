package org.App.Entites.Base;

interface ICelular{
    public void ligar();
    public void desligar();
    public void fazerLigacao(String numero);
    public void enviarMensagem(String numero, String mensagem);
}

public abstract class Celular implements ICelular {
    @Override
    public abstract void ligar();

    @Override
    public abstract void desligar();

    @Override
    public abstract void fazerLigacao(String numero);

    @Override
    public abstract void enviarMensagem(String numero, String mensagem);
}
