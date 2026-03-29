import java.util.*;

public class GenericosEjemplo {

    /** Clase genérica simple */
    static class Caja<T> {
        private T contenido;

        Caja(T contenido) {
            this.contenido = contenido;
        }

        T obtener() {
            return contenido;
        }

        @Override
        public String toString() {
            return "Caja{" + "contenido=" + contenido + '}';
        }
    }

    public static void main(String[] args) {
        Caja<Integer> cajaInt = new Caja<>(10);
        Caja<String>  cajaStr = new Caja<>("Hola");

        System.out.println(cajaInt);
        System.out.println(cajaStr);

        // Uso de genéricos con la API de colecciones
        List<String> lista = List.of("A", "B", "C");
        System.out.println("Lista genérica: " + lista);
    }
}
