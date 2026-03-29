/**
 * Tipos primitivos y literales
 * ----------------------------
 * byte, short, int, long, float, double, char, boolean.
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        byte   b  = 100;          // -128 … 127
        short  s  = 32_000;        // -32 768 … 32 767
        int    i  = 2_147_483_647;
        long   l  = 9_223_372_036_854_775_807L;   // sufijo L
        float  f  = 3.14F;        // sufijo F
        double d  = 2.71828;
        char   c  = 'J';
        boolean bool = true;

        System.out.printf("byte=%d, short=%d, int=%d, long=%d%n", b, s, i, l);
        System.out.printf("float=%.2f, double=%.5f, char=%c, boolean=%b%n",
                f, d, c, bool);
    }
}
