import java.util.*;

public class ColeccionesEjemplo {
    public static void main(String[] args) {
        // List – ArrayList
        List<String> lista = new ArrayList<>();
        lista.add("rojo");
        lista.add("verde");
        lista.add("azul");
        System.out.println("Lista: " + lista);

        // Set – HashSet (no permite duplicados)
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(1, 2, 3, 2));
        System.out.println("Set (sin duplicados): " + conjunto);

        // Map – HashMap
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);
        System.out.println("Mapa: " + mapa);

        // Iteración con foreach
        System.out.print("Iterando List: ");
        for (String color : lista) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}
