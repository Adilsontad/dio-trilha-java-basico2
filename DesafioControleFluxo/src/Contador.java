import java.util.Locale;
import java.util.Scanner;

public class Contador {
  
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
 
    System.out.println("Digite o primeiro valor: ");
    int valor1 = scanner.nextInt();
    
    System.out.println("Digite o segundo valor: ");
    int valor2 = scanner.nextInt();
    
do
    System.out.println(valor1++);

     while (valor1 <= valor2);
     
     scanner.close();
     
            
}

    }

