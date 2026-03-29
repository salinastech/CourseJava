/**
Herencia

Permite que una clase (subclase) reutilice atributos y métodos de otra (superclase).
La subclase puede añadir o sobrescribir comportamiento.
 */

public class Herencia {

    /** Superclase */
    static class Animal {
        void hacerSonido() {
            System.out.println("Sonido genérico");
        }
    }

    /** Subclase */
    static class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Guau!");
        }

        void moverCola() {
            System.out.println("Moviendo la cola...");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.hacerSonido();           // Sonido genérico

        Perro p = new Perro();
        p.hacerSonido();           // Guau!
        p.moverCola();              // Moviendo la cola
    }
}
