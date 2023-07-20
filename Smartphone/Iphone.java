package Smartphone;


import Internet.NavegadorInternet;
import Musica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina via Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada via Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada via Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Midia via Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Midia via Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Midia via Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando Ligação via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Chamada Atendida via Iphone");
    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado via Iphone");
    }
}
