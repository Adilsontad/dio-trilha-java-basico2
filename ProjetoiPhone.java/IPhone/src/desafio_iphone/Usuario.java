package desafio_iphone;
import desafio_iphone.Navegador.NavegadorNaInternet;
import desafio_iphone.NovoiPhone.NovoiPhone;
import desafio_iphone.ReprodutorMusical.ReprodutorMusical;
import desafio_iphone.Telefones.AparelhoTelefonico;

public class Usuario {
    public static void main(String[] args) {
        NovoiPhone teste =  new NovoiPhone();
        ReprodutorMusical Ipod = teste;
        NavegadorNaInternet NavegadorNaInternet = teste;
        AparelhoTelefonico AparelhoTelefonico = teste;
        Ipod.tocar();
        NavegadorNaInternet.navegar();
        AparelhoTelefonico.telefonar();
        
    }
    
}
