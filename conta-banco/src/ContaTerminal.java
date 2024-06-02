import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    @SuppressWarnings("resource")
    public static void main(String[] args){ 
          Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua Agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta:");
        int conta = scanner.nextInt();

        
        System.out.println("Digite o seu saldo:");
        Double saldo = scanner.nextDouble();
            
        //"Olá, [NomeCliente] , obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"

        System.out.println("Olá, " + nomeCliente + "" + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é: "  + agencia);
        System.out.println("conta: " + conta);
        System.out.println("e seu saldo: " + saldo + " já está disponível para saque");
    


                }


            }
