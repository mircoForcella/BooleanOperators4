public class booleanOperators4 {
    /**
     * [A]: considering that a=1, b=3, c=a*b, d=c: (d / c + 2) >= b || !(c + b - c / a == 3)
     * [B]: considering that x=5, y=6, t=false and f=true: (x * x - y * y / 2 != 12) || !t && f
     *
     * Solving
     * [A] (4 / 4+2) >= 3 || !(4 + 3 - 4 / 1 == 3) ----- 3 >= 3 = (true) || 3 == 3 = !true = (false)
     * [B](5 * 6 - 6 * 6 / 2 != 12) || true && true    ------  12 != 12  = (false) || true && true = true
     *
     * Summary
     * true || false = true
     * false || true = true
     *
     */
    public static void main(String[] args) {
        boolean a = (4 / 4+2) >= 3 || !(4 + 3 - 4 / 1 == 3);
        boolean b = (5 * 6 - 6 * 6 / 2 != 12) || true && true;

        System.out.println(a);
        System.out.println(b);
    }
}
