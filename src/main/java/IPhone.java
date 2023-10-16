package main.java;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isMusicPlaying;
    private boolean isCallInProgress;
    private boolean isInternetBrowserOpen;

    public IPhone() {
        isMusicPlaying = false;
        isCallInProgress = false;
        isInternetBrowserOpen = false;
    }

    @Override
    public void tocar() {
        isMusicPlaying = true;
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        isMusicPlaying = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void ligar() {
        isCallInProgress = true;
        System.out.println("Ligação em andamento.");
    }

    @Override
    public void atender() {
        isCallInProgress = true;
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        isInternetBrowserOpen = true;
        System.out.println("Exibindo página da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web.");
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.tocar();
        iphone.ligar();
        iphone.exibirPagina();
    }
}
