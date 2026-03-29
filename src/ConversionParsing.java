/**
 * Conversión y parsing
 * -------------------
 * Autoboxing / unboxing, wrappers, parseInt / parseDouble, valueOf.
 */
public class ConversionParsing {
    public static void main(String[] args) {
        // Wrapper → primitivo
        Integer enteroObj = Integer.valueOf(42);
        int entero = enteroObj;                // autounboxing

        // String → primitivo
        int num = Integer.parseInt("123");
        double d = Double.parseDouble("3.1415");

        // Primitivo → String
        String s1 = String.valueOf(num);
        String s2 = Integer.toString(num);     // variante estática

        System.out.println("int = " + entero + ", parsed = " + num);
        System.out.println("double = " + d);
        System.out.println("String 1 = " + s1 + ", String 2 = " + s2);
    }
}
