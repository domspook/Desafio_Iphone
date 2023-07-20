package Telefone;

public class Discador implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Realizando Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Chamada Atendida");
    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Inciando Correio de Voz");
    }
}
