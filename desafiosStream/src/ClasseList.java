import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClasseList {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        long countNumerosUnicos = numeros.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        
        List<Integer> numerosOrdemNatural = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);
   
    int somaDosNumerosPares = numeros.stream()
                .filter(i -> (i % 2 == 0))
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares); 
        
        List<Boolean> numerosPositivos = numeros.stream()
        .map(num -> num > 0)
        .collect(Collectors.toList());
        System.out.println(numerosPositivos);

        int removerImpares = numeros.stream()
        .filter(i -> ((i+1) % 2 == 0))
        .distinct()
        .mapToInt(Integer::intValue)
        .sum();
        System.out.println("Lista números impares: " + removerImpares);

        int mediaDosNumeros = numeros.stream()
                .filter(i -> (i > 5))
                .distinct()
                .mapToInt(Integer::intValue)
                .media();
        System.out.println("Pegue apenas os números maiores de 5 e veja média: " + mediaDosNumeros); 
        



   
    }
    }
   

