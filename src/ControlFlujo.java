/**
 * Flujo de control

 Estructuras que alteran la secuencia de ejecución:
    - if / else
    - switch
    - bucles: while, do‑while, for, foreach
 */
public class FlujoControl {
    public static void main(String[] args) {
        int numero = 7;

        // if / else
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

        // switch
        String mes = "Marzo";
        switch (mes) {
            case "Enero", "Febrero", "Marzo":
                System.out.println("Primer trimestre");
                break;
            default:
                System.out.println("Otro trimestre");
        }

        // for
        System.out.print("Cuenta regresiva: ");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
