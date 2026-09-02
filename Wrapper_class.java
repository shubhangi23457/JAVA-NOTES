import java.util.*;

class Main {
    public static void main(String[] args) {

        // 1. Primitive
        int a = 10;

        // 2. Autoboxing: int → Integer
        Integer b = a;

        // 3. Auto-unboxing: Integer → int
        int c = b;

        // 4. String → primitive
        int d = Integer.parseInt("50");

        // 5. String → Wrapper object
        Integer e = Integer.valueOf("100");

        // 6. Wrapper object → primitive
        int f = e.intValue();

        // 7. Wrapper object → String
        String str = e.toString();

        // 8. Comparing values
        Integer x = 100;
        Integer y = 100;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("str = " + str);

        // Integer methods
        System.out.println("Maximum = " + Integer.max(10, 20));
        System.out.println("Minimum = " + Integer.min(10, 20));
        System.out.println("Compare = " + Integer.compare(10, 20));

        // equals() vs ==
        System.out.println("x == y: " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));

        // Character methods
        System.out.println("Is digit: " + Character.isDigit('5'));
        System.out.println("Is letter: " + Character.isLetter('A'));
        System.out.println("Is uppercase: " + Character.isUpperCase('A'));
        System.out.println("Lowercase: " + Character.toLowerCase('A'));

        // Double methods
        double num = Double.parseDouble("25.5");
        System.out.println("Double value = " + num);

        // Boolean methods
        boolean flag = Boolean.parseBoolean("true");
        System.out.println("Boolean value = " + flag);
    }
}