package Utilizando;

import Internet.NavegadorInternet;
import Internet.Safari;
import Musica.Itunes;
import Musica.ReprodutorMusical;
import Smartphone.Iphone;
import Telefone.AparelhoTelefonico;
import Telefone.Discador;

public class HomeScreen {
    public static void main(String[] args) {
        //Realizando ações teste via ‘interface’
        AparelhoTelefonico disc = new Discador();
        disc.atender();
        disc.ligar();
        disc.inciarCorreioVoz();

        ReprodutorMusical midia = new Itunes();
        midia.tocar();
        midia.pausar();
        midia.selecionarMusica();

        NavegadorInternet navegador = new Safari();
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();

        //Realizando ações via Iphone
        Iphone smart = new Iphone();
        smart.ligar();
        smart.atender();
        smart.inciarCorreioVoz();
        smart.tocar();
        smart.pausar();
        smart.selecionarMusica();
        smart.exibirPagina();
        smart.atualizarPagina();
        smart.adicionarNovaAba();
    }
}
