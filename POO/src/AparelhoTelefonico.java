
public class AparelhoTelefonico implements AparelhoTelefonicoInterface {

    private String numeroAtual;
    private boolean estaLigando;
    private int bateria;

    public AparelhoTelefonico() {
        this.numeroAtual = "";
        this.estaLigando = false;
        this.bateria = 100;
    }

    public void ligar(String numero) {
        if (!estaLigando) {
            estaLigando = true;
            this.numeroAtual = numero;
            System.out.println("Ligando para: " + numero);
        } else {
            System.out.println("Já está ligando para outro número");
        }
    }

    public void atender() {
        if (estaLigando) {
            System.out.println("Atendendo chamada");
        } else {
            System.out.println("Não há chamada para atender");
        }
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void carregarBateria() {
        if (bateria < 100) {
            bateria += 10;
            System.out.println("Bateria carregada para: " + bateria);
        } else {
            System.out.println("Bateria já está carregada");
        }
    }

    public String getNumeroAtual() {
        return numeroAtual;
    }

    public boolean isEstaLigando() {
        return estaLigando;
    }

    public int getBateria() {
        return bateria;
    }
}