import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        // Filtrar pares, elevar al cuadrado y recoger en una lista
        List<Integer> paresAlCuadrado = numeros.stream()
                .filter(n -> n % 2 == 0)          // solo pares
                .map(n -> n * n)                  // cuadrado
                .collect(Collectors.toList());   // materializar

        System.out.println("Pares al cuadrado: " + paresAlCuadrado);
    }
}
