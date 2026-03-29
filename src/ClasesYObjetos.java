/**
Clases y objetos

Java es orientado a objetos. Una clase define la estructura (atributos)
y el comportamiento (métodos) de los objetos que se crean a partir de ella.
 */

public class ClasesYObjetos {

    // Clase interna (modelo de un coche)
    static class Coche {
        String marca;
        int velocidad;

        Coche(String marca) {
            this.marca = marca;
            this.velocidad = 0;
        }

        void acelerar(int incremento) {
            velocidad += incremento;
        }

        @Override
        public String toString() {
            return marca + " → " + velocidad + " km/h";
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota");
        miCoche.acelerar(50);
        System.out.println(miCoche);
    }
}
