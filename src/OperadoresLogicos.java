/**
 * Operadores lógicos
 * -----------------
 * &&  (AND)  → ambas expresiones deben ser true
 * ||  (OR)   → al menos una es true
 * !   (NOT)  → invierte el valor booleano
 * ^   (XOR)  → true solo si una es true y la otra false
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a      = " + (!a));
        System.out.println("a ^ b   = " + (a ^ b));
    }
}
