package teste;
import teste.Navegador.NavegadorNaInternet;
import teste.ReprodutorMusical.ReprodutorMusical;
import teste.Telefones.AparelhoTelefonico;
import teste.NovoiPhone.NovoiPhone;

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
