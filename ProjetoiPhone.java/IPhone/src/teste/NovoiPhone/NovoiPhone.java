package teste.NovoiPhone;
import teste.Navegador.NavegadorNaInternet;
import teste.ReprodutorMusical.ReprodutorMusical;
import teste.Telefones.AparelhoTelefonico;

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
