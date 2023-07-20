package Musica;

public class Itunes implements ReprodutorMusical {

    public void tocar(){
        System.out.println("Tocando Midia");
    }

    public void pausar() {
        System.out.println("Pausando Midia");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando Midia");
    }
}
