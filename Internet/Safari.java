package Internet;

public class Safari implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exbindo Nova Pagina Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }
}
