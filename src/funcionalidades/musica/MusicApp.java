package funcionalidades.musica;

public class MusicApp implements ReprodutorMusical {

    public void tocar(){
        System.out.println("Música tocando!");
    }

    public void pausar(){
        System.out.println("Música pausada!");
    }

    public void selecionarMusica(){
        System.out.println("Nova música selecionada!");
    }
    
}
