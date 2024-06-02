package funcionalidades.ligacao;

public class LigacoesApp implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Realizando a ligação!");
    }

    public void atender(){
        System.out.println("Ligação Atendida!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz!");
    }
}
