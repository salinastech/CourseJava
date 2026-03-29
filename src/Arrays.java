/**
Arrays

Un array es una estructura que almacena varios valores del mismo tipo,
accesibles mediante un índice (parte de 0).
 */

public class Arrays {
    public static void main(String[] args) {
        // Declaración e inicialización
        int[] notas = {8, 7, 9, 6};

        // Recorrido con for tradicional
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        // Recorrido con foreach (enhanced for)
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        System.out.println("Promedio = " + (suma / (double) notas.length));
    }
}
