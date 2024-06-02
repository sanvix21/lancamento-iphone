package funcionalidades.smartphone;

import funcionalidades.ligacao.AparelhoTelefonico;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.navegador.NavegadorDeInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet {

    public void ligar(){
        System.out.println("Realizando uma ligação com o App Ligações!");
    }
    public void atender(){
        System.out.println("Atendendo uma ligação com o App Ligações!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz com o App Ligações!");
    }

    public void tocar(){
        System.out.println("Tocando uma música com o App Music!");
    }
    public void pausar(){
        System.out.println("Pausando uma música com o App Music!");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando uma música com o App Music!");
    }

    public void exibirPagina(){
        System.out.println("Exibindo uma página no navegador!");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba no navegador!");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando uma página no navegador!");
    }
}
