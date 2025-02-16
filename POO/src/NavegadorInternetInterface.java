public interface NavegadorInternetInterface {

    void exibirPagina(String url);

    void adicionarNovaAba();

    void fecharAba();

    void adicionarFavorito(String url);

    void removerFavorito(String url);

    void atualizarPagina();
}
