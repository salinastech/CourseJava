import java.util.*;
import java.util.stream.*;

public class StreamsEjemplo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar pares, elevar al cuadrado y coleccionar en una lista
        List<Integer> paresAlCuadrado = numeros.stream()
                .filter(n -> n % 2 == 0)      // solo pares
                .map(n -> n * n)             // cuadrado
                .collect(Collectors.toList());

        System.out.println("Pares al cuadrado: " + paresAlCuadrado);

        // Reducción: suma de todos los números
        int suma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma total = " + suma);
    }
}
