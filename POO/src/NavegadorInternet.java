
public class NavegadorInternet implements NavegadorInternetInterface {

    private String urlAtual;
    private String[] favoritos;
    private int numeroAbasAbertas;

    public NavegadorInternet() {
        this.urlAtual = "";
        this.favoritos = new String[10];
        this.numeroAbasAbertas = 1;
    }

    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        if (numeroAbasAbertas < 10) {
            numeroAbasAbertas++;
            System.out.println("Nova aba adicionada. Total de abas: " + numeroAbasAbertas);
        } else {
            System.out.println("Não há espaço para mais abas");
        }
    }

    public void fecharAba() {
        if (numeroAbasAbertas > 1) {
            numeroAbasAbertas--;
            System.out.println("Aba fechada. Total de abas: " + numeroAbasAbertas);
        } else {
            System.out.println("Não há abas para fechar");
        }
    }

    public void adicionarFavorito(String url) {
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] == null) {
                favoritos[i] = url;
                System.out.println("Favorito adicionado: " + url);
                return;
            }
        }
        System.out.println("Não há espaço para mais favoritos");
    }

    public void removerFavorito(String url) {
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] != null && favoritos[i].equals(url)) {
                favoritos[i] = null;
                System.out.println("Favorito removido: " + url);
                return;
            }
        }
        System.out.println("Favorito não encontrado");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public String getUrlAtual() {
        return urlAtual;
    }

    public String[] getFavoritos() {
        return favoritos;
    }

    public int getNumeroAbasAbertas() {
        return numeroAbasAbertas;
    }
}