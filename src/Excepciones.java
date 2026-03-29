/**
 * Excepciones
 * -----------
 * Mecanismo para manejar situaciones anómalas (errores) en tiempo de ejecución.
 * Se usan bloques try / catch / finally y la palabra clave `throw`.
 */

public class Excepciones {
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor no puede ser cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try‑catch");
        }
    }
}
