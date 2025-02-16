
public class ReprodutorMusical implements ReprodutorMusicalInterface {

    private String musicaAtual;
    private boolean estaTocando;
    private int volume;

    public ReprodutorMusical() {
        this.musicaAtual = "";
        this.estaTocando = false;
        this.volume = 50;
    }

    public void tocar() {
        if (!estaTocando) {
            estaTocando = true;
            System.out.println("Tocando música");
        } else {
            System.out.println("Música já está tocando");
        }
    }

    public void pausar() {
        if (estaTocando) {
            estaTocando = false;
            System.out.println("Pausando música");
        } else {
            System.out.println("Música já está pausada");
        }
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já está no máximo");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo");
        }
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public boolean isEstaTocando() {
        return estaTocando;
    }

    public int getVolume() {
        return volume;
    }
}