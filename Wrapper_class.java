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

// Integer.parseInt("10"); // int
// Integer.valueOf("10"); // Integer

// ENHANCED FOR LOOP
// int[] numbers = {10, 20, 30, 40};
// for (int number : numbers) {
// System.out.println(number);
// }

/*
 * ============================================================
 * JAVA WRAPPER CLASSES + AUTOBOXING + UNBOXING
 * IMPORTANT CODING QUESTIONS + SOLUTIONS
 * ============================================================
 */

// 1. AUTOBOXING
// Question:
// Convert a primitive int into an Integer using autoboxing.

class Q1_Autoboxing {
    public static void main(String[] args) {

        int x = 100;

        Integer obj = x;

        System.out.println(obj);
    }
}

// 2. UNBOXING
// Question:
// Convert an Integer object into a primitive int.

class Q2_Unboxing {
    public static void main(String[] args) {

        Integer obj = 100;

        int x = obj;

        System.out.println(x);
    }
}

// 3. EXPLICIT BOXING USING valueOf()
// Question:
// Convert an int into an Integer using Integer.valueOf().

class Q3_ValueOf {
    public static void main(String[] args) {

        int x = 50;

        Integer obj = Integer.valueOf(x);

        System.out.println(obj);
    }
}

// 4. STRING TO int USING parseInt()
// Question:
// Convert a numeric String into a primitive int.

class Q4_ParseInt {
    public static void main(String[] args) {

        String s = "123";

        int num = Integer.parseInt(s);

        System.out.println(num);
    }
}

// 5. STRING TO INTEGER USING valueOf()
// Question:
// Convert a numeric String into an Integer object.

class Q5_StringToInteger {
    public static void main(String[] args) {

        String s = "123";

        Integer num = Integer.valueOf(s);

        System.out.println(num);
    }
}

// 6. INTEGER TO STRING
// Question:
// Convert an Integer object into a String.

class Q6_IntegerToString {
    public static void main(String[] args) {

        Integer num = 123;

        String s = num.toString();

        System.out.println(s);
    }
}

// 7. INTEGER TO int
// Question:
// Convert an Integer object into primitive int explicitly.

class Q7_IntegerToInt {
    public static void main(String[] args) {

        Integer obj = 500;

        int num = obj.intValue();

        System.out.println(num);
    }
}

// 8. intValue()
// Question:
// Demonstrate intValue() with an Integer object.

class Q8_IntValue {
    public static void main(String[] args) {

        Integer obj = 250;

        int x = obj.intValue();

        System.out.println(x);
    }
}

// 9. DOUBLE WRAPPER
// Question:
// Convert a double primitive into a Double wrapper.

class Q9_DoubleWrapper {
    public static void main(String[] args) {

        double x = 25.75;

        Double obj = x;

        System.out.println(obj);
    }
}

// 10. FLOAT WRAPPER
// Question:
// Convert a float primitive into a Float wrapper.

class Q10_FloatWrapper {
    public static void main(String[] args) {

        float x = 10.5f;

        Float obj = x;

        System.out.println(obj);
    }
}

// 11. LONG WRAPPER
// Question:
// Convert a long primitive into a Long wrapper.

class Q11_LongWrapper {
    public static void main(String[] args) {

        long x = 100000L;

        Long obj = x;

        System.out.println(obj);
    }
}

// 12. CHARACTER WRAPPER
// Question:
// Convert a char into a Character object.

class Q12_CharacterWrapper {
    public static void main(String[] args) {

        char ch = 'A';

        Character obj = ch;

        System.out.println(obj);
    }
}

// 13. BOOLEAN WRAPPER
// Question:
// Convert a boolean into a Boolean object.

class Q13_BooleanWrapper {
    public static void main(String[] args) {

        boolean x = true;

        Boolean obj = x;

        System.out.println(obj);
    }
}

// 14. BYTE WRAPPER
// Question:
// Convert a byte primitive into a Byte object.

class Q14_ByteWrapper {
    public static void main(String[] args) {

        byte x = 10;

        Byte obj = x;

        System.out.println(obj);
    }
}

// 15. SHORT WRAPPER
// Question:
// Convert a short primitive into a Short object.

class Q15_ShortWrapper {
    public static void main(String[] args) {

        short x = 20;

        Short obj = x;

        System.out.println(obj);
    }
}

// 16. SUM OF TWO INTEGER WRAPPERS
// Question:
// Add two Integer objects.

class Q16_AddWrappers {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;

        int sum = a + b;

        System.out.println(sum);
    }
}

// 17. ALL ARITHMETIC OPERATIONS
// Question:
// Perform arithmetic operations using wrapper objects.

class Q17_WrapperArithmetic {
    public static void main(String[] args) {

        Integer a = 20;
        Integer b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}

// 18. COMPARE TWO INTEGER OBJECTS USING equals()
// Question:
// Check whether two Integer objects contain the same value.

class Q18_IntegerEquals {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        if (a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

// 19. COMPARE INTEGER OBJECTS USING ==
// Question:
// Demonstrate reference comparison between Integer objects.

class Q19_IntegerReferenceComparison {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        if (a == b)
            System.out.println("Same reference");
        else
            System.out.println("Different references");
    }
}

// 20. INTEGER CACHE DEMONSTRATION
// Question:
// Demonstrate the Integer caching behavior.

class Q20_IntegerCache {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);
        System.out.println(c == d);

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }
}

// 21. STRING TO INTEGER WITH EXCEPTION HANDLING
// Question:
// Convert a String to int and safely handle invalid input.

class Q21_ParseException {
    public static void main(String[] args) {

        String s = "123";

        try {

            int num = Integer.parseInt(s);

            System.out.println(num);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number");
        }
    }
}

// 22. CHECK EVEN/ODD USING INTEGER
// Question:
// Determine whether an Integer is even or odd.

class Q22_EvenOdd {
    public static void main(String[] args) {

        Integer num = 24;

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// 23. FIND MAXIMUM OF TWO INTEGER OBJECTS
// Question:
// Find the larger value using Integer objects.

class Q23_MaxInteger {
    public static void main(String[] args) {

        Integer a = 50;
        Integer b = 80;

        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}

// 24. FIND MINIMUM USING Integer.min()
// Question:
// Find the smaller of two integers using wrapper methods.

class Q24_MinInteger {
    public static void main(String[] args) {

        Integer a = 50;
        Integer b = 80;

        int result = Integer.min(a, b);

        System.out.println(result);
    }
}

// 25. FIND MAXIMUM USING Integer.max()
// Question:
// Find the larger of two integers.

class Q25_MaxMethod {
    public static void main(String[] args) {

        Integer a = 50;
        Integer b = 80;

        int result = Integer.max(a, b);

        System.out.println(result);
    }
}

// 26. CHECK PRIME USING INTEGER
// Question:
// Check whether an Integer is prime.

class Q26_Prime {
    public static void main(String[] args) {

        Integer n = 29;

        boolean prime = true;

        if (n < 2) {
            prime = false;
        } else {

            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {

                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

// 27. REVERSE AN INTEGER
// Question:
// Reverse the digits of an Integer.

class Q27_ReverseInteger {
    public static void main(String[] args) {

        Integer n = 12345;

        int num = n;
        int reverse = 0;

        while (num != 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num /= 10;
        }

        System.out.println(reverse);
    }
}

// 28. PALINDROME INTEGER
// Question:
// Check whether an Integer is a palindrome.

class Q28_PalindromeInteger {
    public static void main(String[] args) {

        Integer n = 1221;

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

// 29. SUM OF DIGITS
// Question:
// Find the sum of digits of an Integer.

class Q29_SumDigits {
    public static void main(String[] args) {

        Integer n = 12345;

        int sum = 0;

        while (n > 0) {

            sum += n % 10;

            n /= 10;
        }

        System.out.println(sum);
    }
}

// 30. COUNT DIGITS
// Question:
// Count the number of digits in an Integer.

class Q30_CountDigits {
    public static void main(String[] args) {

        Integer n = 123456;

        int count = 0;

        while (n > 0) {

            count++;
            n /= 10;
        }

        System.out.println(count);
    }
}

// 31. CHARACTER METHODS
// Question:
// Check whether a Character is uppercase, lowercase,
// digit or whitespace.

class Q31_CharacterMethods {
    public static void main(String[] args) {

        Character ch = 'A';

        System.out.println(
                Character.isUpperCase(ch));

        System.out.println(
                Character.isLowerCase(ch));

        System.out.println(
                Character.isDigit(ch));

        System.out.println(
                Character.isWhitespace(ch));
    }
}

// 32. TOGGLE CHARACTER CASE
// Question:
// Convert an uppercase Character to lowercase and vice versa.

class Q32_ToggleCharacter {
    public static void main(String[] args) {

        Character ch = 'A';

        if (Character.isUpperCase(ch)) {

            ch = Character.toLowerCase(ch);

        } else {

            ch = Character.toUpperCase(ch);
        }

        System.out.println(ch);
    }
}

// 33. BOOLEAN PARSING
// Question:
// Convert a String into a Boolean value.

class Q33_BooleanParsing {
    public static void main(String[] args) {

        String s = "true";

        Boolean value = Boolean.valueOf(s);

        System.out.println(value);
    }
}

// 34. DOUBLE PARSING
// Question:
// Convert a String into a primitive double.

class Q34_DoubleParsing {
    public static void main(String[] args) {

        String s = "25.75";

        double value = Double.parseDouble(s);

        System.out.println(value);
    }
}

// 35. INTEGER ARRAY USING WRAPPER CLASS
// Question:
// Create an Integer array and calculate its sum.

class Q35_IntegerArray {
    public static void main(String[] args) {

        Integer[] arr = { 10, 20, 30, 40, 50 };

        int sum = 0;

        for (Integer value : arr) {

            sum += value;
        }

        System.out.println("Sum = " + sum);
    }
}

// 36. FIND MAXIMUM IN Integer ARRAY
// Question:
// Find the maximum value in an Integer array.

class Q36_MaxIntegerArray {
    public static void main(String[] args) {

        Integer[] arr = { 10, 50, 20, 90, 30 };

        Integer max = arr[0];

        for (Integer value : arr) {

            if (value > max)
                max = value;
        }

        System.out.println("Maximum = " + max);
    }
}

// 37. SORT Integer ARRAY
// Question:
// Sort an Integer array using Arrays.sort().

class Q37_SortIntegerArray {
    public static void main(String[] args) {

        Integer[] arr = { 50, 10, 40, 20, 30 };

        Arrays.sort(arr);

        System.out.println(
                Arrays.toString(arr));
    }
}

// 38. ARRAYLIST WITH WRAPPER CLASS
// Question:
// Store primitive-like integer values in an ArrayList
// using autoboxing.

class Q38_ArrayListAutoboxing {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        int sum = 0;

        for (Integer value : list) {

            sum += value;
        }

        System.out.println(sum);
    }
}

// 39. REMOVE AN ELEMENT FROM ArrayList
// Question:
// Remove an element from an ArrayList<Integer>.
// Demonstrate the difference between remove(int)
// and remove(Integer).

class Q39_ArrayListRemove {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        // Removes element at index 1
        list.remove(1);

        // Removes the Integer value 30
        list.remove(Integer.valueOf(30));

        System.out.println(list);
    }
}

// 40. HANDLE NULL WRAPPER
// Question:
// Safely check an Integer for null before unboxing.

class Q40_NullWrapper {
    public static void main(String[] args) {

        Integer num = null;

        if (num != null) {

            int value = num;

            System.out.println(value);

        } else {

            System.out.println("Value is null");
        }
    }
}

// 41. SUM OF Integer VALUES FROM ARRAYLIST
// Question:
// Calculate the sum of Integer objects using unboxing.

class Q41_ArrayListSum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        int sum = 0;

        for (int value : list) {

            sum += value;
        }

        System.out.println(sum);
    }
}

// 42. COMPARE INTEGER VALUES SAFELY
// Question:
// Compare two Integer objects based on their values.

class Q42_CompareIntegers {
    public static void main(String[] args) {

        Integer a = 200;
        Integer b = 200;

        if (a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

// 43. compareTo()
// Question:
// Compare two Integer objects using compareTo().

class Q43_IntegerCompareTo {
    public static void main(String[] args) {

        Integer a = 50;
        Integer b = 100;

        int result = a.compareTo(b);

        if (result < 0)
            System.out.println("a is smaller");

        else if (result > 0)
            System.out.println("a is greater");

        else
            System.out.println("Equal");
    }
}

// 44. CONVERT INTEGER TO BINARY
// Question:
// Convert an Integer into its binary String representation.

class Q44_IntegerBinary {
    public static void main(String[] args) {

        Integer n = 25;

        String binary = Integer.toBinaryString(n);

        System.out.println(binary);
    }
}

// 45. CONVERT INTEGER TO HEXADECIMAL
// Question:
// Convert an Integer into hexadecimal representation.

class Q45_IntegerHex {
    public static void main(String[] args) {

        Integer n = 255;

        String hex = Integer.toHexString(n);

        System.out.println(hex);
    }
}

// 46. CHECK INTEGER SIGN
// Question:
// Determine whether an Integer is positive, negative or zero.

class Q46_IntegerSign {
    public static void main(String[] args) {

        Integer n = -10;

        if (n > 0)
            System.out.println("Positive");

        else if (n < 0)
            System.out.println("Negative");

        else
            System.out.println("Zero");
    }
}

// 47. SUM OF INTEGER ARRAY USING STREAMS
// Question:
// Find the sum of an Integer array using streams.

class Q47_IntegerStream {
    public static void main(String[] args) {

        Integer[] arr = { 10, 20, 30, 40 };

        int sum = Arrays.stream(arr)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}

// 48. FIND AVERAGE OF Integer ARRAY
// Question:
// Find the average of values stored in Integer[].

class Q48_IntegerAverage {
    public static void main(String[] args) {

        Integer[] arr = { 10, 20, 30, 40, 50 };

        int sum = 0;

        for (Integer value : arr) {

            sum += value;
        }

        double average = (double) sum / arr.length;

        System.out.println(average);
    }
}

// 49. CONVERT String ARRAY TO Integer ARRAY
// Question:
// Convert an array of numeric Strings into Integer objects.

class Q49_StringToIntegerArray {
    public static void main(String[] args) {

        String[] values = { "10", "20", "30", "40" };

        Integer[] numbers = new Integer[values.length];

        for (int i = 0; i < values.length; i++) {

            numbers[i] = Integer.valueOf(values[i]);
        }

        System.out.println(
                Arrays.toString(numbers));
    }
}

// 50. FIND SECOND LARGEST INTEGER
// Question:
// Find the second largest distinct value in an Integer array.

class Q50_SecondLargest {
    public static void main(String[] args) {

        Integer[] arr = {
                10, 50, 20, 50, 30, 40
        };

        Integer largest = null;
        Integer second = null;

        for (Integer value : arr) {

            if (largest == null || value > largest) {

                if (largest != null &&
                        !value.equals(largest)) {

                    second = largest;
                }

                largest = value;

            } else if (!value.equals(largest) &&
                    (second == null || value > second)) {

                second = value;
            }
        }

        if (second != null)
            System.out.println(
                    "Second largest = " + second);
        else
            System.out.println(
                    "No second largest distinct value");
    }
}