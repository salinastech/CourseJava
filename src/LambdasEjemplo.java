import java.util.*;
import java.util.function.*;

public class LambdasEjemplo {
    public static void main(String[] args) {
        // Lambda que comprueba si un número es par
        Predicate<Integer> esPar = n -> n % 2 == 0;

        System.out.println("4 es par? " + esPar.test(4));
        System.out.println("7 es par? " + esPar.test(7));

        // Función que eleva al cubo
        Function<Integer, Integer> cubo = x -> x * x * x;
        System.out.println("3³ = " + cubo.apply(3));

        // Consumidor que imprime un mensaje
        Consumer<String> imprimir = System.out::println;
        imprimir.accept("¡Lambda en acción!");
    }
}
