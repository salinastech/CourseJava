/**
 Constantes

 En Java una constante se declara con la palabra clave `final`. 
 Si la constante pertenece a la clase y no a una instancia, se combina con `static`.
 Por convención se escribe en mayúsculas y con guiones bajos.
 */

public class Constantes {
    public static final double PI = 3.1415926535;
    public static final int MAX_USUARIOS = 100;

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
        System.out.println("Máximo de usuarios: " + MAX_USUARIOS);
    }
}
