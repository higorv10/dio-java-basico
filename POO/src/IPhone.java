
public class IPhone {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    public void aumentarVolume() {
        reprodutorMusical.aumentarVolume();
    }

    public void diminuirVolume() {
        reprodutorMusical.diminuirVolume();
    }

    public void ligarPara(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void carregarBateria() {
        aparelhoTelefonico.carregarBateria();
    }

    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void fecharAba() {
        navegadorInternet.fecharAba();
    }

    public void adicionarFavorito(String url) {
        navegadorInternet.adicionarFavorito(url);
    }

    public void removerFavorito(String url) {
        navegadorInternet.removerFavorito(url);
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.tocarMusica();
        iPhone.pausarMusica();
        iPhone.selecionarMusica("Musica 1");
        iPhone.aumentarVolume();
        iPhone.diminuirVolume();
        iPhone.ligarPara("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.carregarBateria();
        iPhone.exibirPagina("https://www.google.com");
        iPhone.adicionarNovaAba();
        iPhone.fecharAba();
        iPhone.adicionarFavorito("https://www.google.com");
        iPhone.removerFavorito("https://www.google.com");
        iPhone.atualizarPagina();
    }
}