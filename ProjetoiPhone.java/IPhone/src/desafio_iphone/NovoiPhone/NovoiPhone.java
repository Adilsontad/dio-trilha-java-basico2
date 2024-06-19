package desafio_iphone.NovoiPhone;
import desafio_iphone.Navegador.NavegadorNaInternet;
import desafio_iphone.ReprodutorMusical.ReprodutorMusical;
import desafio_iphone.Telefones.AparelhoTelefonico;

public class NovoiPhone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
       
    public void navegar() {
      System.out.println("ENTRANDO NA INTERNET COM IPHONE ");
    }
    public void tocar() {
      System.out.println("REPRODUZINDO MUSICAS COM IPHONE");
    }
    public void telefonar() {
      System.out.println("FAZENDO UMA LIGAÇÃO COM IPHONE");
    }
}
