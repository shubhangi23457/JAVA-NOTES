/*
============================================================
 JAVA INTRODUCTION + JDK + JRE + JVM
 DATA TYPES + VARIABLES + OPERATORS
 NOTES + CODES + IMPORTANT QUESTIONS
============================================================
*/

// NOTES

// 1. INTRODUCTION TO JAVA

/*
Java is a high-level, object-oriented, class-based programming
language.

Main features of Java:

1. Simple
2. Object-Oriented
3. Platform Independent
4. Portable
5. Secure
6. Robust
7. Multithreaded
8. Distributed
9. High Performance
10. Automatic Garbage Collection

Important:
Java follows the principle:

WRITE ONCE, RUN ANYWHERE (WORA)

Java source code is compiled into bytecode.
The bytecode is executed by the JVM.
*/

// 2. JAVA PROGRAM EXECUTION

/*
Java execution process:

.java file
   |
   | javac
   v
.class file (Bytecode)
   |
   | JVM
   v
Machine Code
   |
   v
Output


.java  = Source code
.class = Bytecode

javac = Java compiler
java  = Java launcher
*/

// CODE: BASIC JAVA PROGRAM

class BasicJava {
    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}

// 3. JVM - JAVA VIRTUAL MACHINE

/*
 * JVM stands for Java Virtual Machine.
 * 
 * Main purpose:
 * JVM executes Java bytecode.
 * 
 * Responsibilities of JVM:
 * 
 * 1. Executes bytecode
 * 2. Manages memory
 * 3. Performs garbage collection
 * 4. Provides runtime environment
 * 5. Converts bytecode into machine-level instructions
 * 
 * Important:
 * 
 * JVM is responsible for execution.
 * 
 * JVM itself is platform dependent,
 * but Java bytecode is platform independent.
 */

// 4. JRE - JAVA RUNTIME ENVIRONMENT

/*
 * JRE stands for Java Runtime Environment.
 * 
 * JRE provides the environment required to RUN Java programs.
 * 
 * Conceptually:
 * 
 * JRE = JVM + Java Runtime Libraries
 * 
 * JRE is mainly concerned with running applications.
 */

// 5. JDK - JAVA DEVELOPMENT KIT

/*
 * JDK stands for Java Development Kit.
 * 
 * JDK is used to DEVELOP and RUN Java applications.
 * 
 * Conceptually:
 * 
 * JDK = JRE + Development Tools
 * 
 * Important development tools:
 * 
 * javac -> Java compiler
 * java -> Java launcher
 * javadoc -> Documentation generator
 * jar -> JAR file tool
 * 
 * 
 * Relationship:
 * 
 * JDK
 * |
 * v
 * JRE
 * |
 * v
 * JVM
 * 
 * 
 * Remember:
 * 
 * JDK -> Development
 * JRE -> Runtime
 * JVM -> Execution
 */

// 6. DATA TYPES

/*
 * A data type specifies what type of value a variable can store.
 * 
 * Java data types:
 * 
 * 1. Primitive Data Types
 * 2. Reference / Non-Primitive Data Types
 */

// 7. PRIMITIVE DATA TYPES

/*
 * Java has 8 primitive data types:
 * 
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. char
 * 8. boolean
 */

/*
 * Integer types:
 * 
 * byte
 * short
 * int
 * long
 * 
 * 
 * Floating-point types:
 * 
 * float
 * double
 * 
 * 
 * Character:
 * 
 * char
 * 
 * 
 * Boolean:
 * 
 * boolean
 */

// PRIMITIVE DATA TYPE TABLE

/*
 * byte -> 8 bits
 * short -> 16 bits
 * int -> 32 bits
 * long -> 64 bits
 * 
 * float -> 32 bits
 * double -> 64 bits
 * 
 * char -> 16 bits
 * 
 * boolean -> true / false
 */

// CODE: ALL PRIMITIVE DATA TYPES

class PrimitiveTypes {
    public static void main(String[] args) {

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000L;

        float f = 10.5f;
        double d = 25.75;

        char ch = 'A';

        boolean flag = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(flag);
    }
}

// 8. IMPORTANT RANGE OF DATA TYPES

/*
 * byte:
 * 
 * -128 to 127
 * 
 * 
 * short:
 * 
 * -32768 to 32767
 * 
 * 
 * int:
 * 
 * -2^31 to 2^31 - 1
 * 
 * 
 * long:
 * 
 * -2^63 to 2^63 - 1
 * 
 * 
 * char:
 * 
 * 0 to 65535
 * 
 * 
 * char stores a single Unicode character.
 */

// 9. REFERENCE DATA TYPES

/*
 * Reference data types store references to objects.
 * 
 * Examples:
 * 
 * String
 * Arrays
 * Classes
 * Objects
 * Interfaces
 * 
 * Example:
 */

class ReferenceTypeExample {
    public static void main(String[] args) {

        String name = "Java";

        int[] numbers = { 10, 20, 30 };

        System.out.println(name);
        System.out.println(numbers[0]);
    }
}

// 10. VARIABLES

/*
 * A variable is a named memory location used to store a value.
 * 
 * Syntax:
 * 
 * dataType variableName = value;
 * 
 * Example:
 * 
 * int age = 20;
 * 
 * 
 * Here:
 * 
 * int -> data type
 * age -> variable
 * 20 -> value
 */

// 11. TYPES OF VARIABLES

/*
 * There are mainly three types:
 * 
 * 1. Local Variable
 * 2. Instance Variable
 * 3. Static Variable
 */

// LOCAL VARIABLE

/*
 * A local variable is declared inside a method, constructor
 * or block.
 * 
 * Example:
 */

class LocalVariableExample {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age);
    }
}

/*
 * Important:
 * 
 * Local variables do NOT get default values.
 * 
 * They must be initialized before use.
 */

// INSTANCE VARIABLE

/*
 * An instance variable is declared inside a class but outside
 * methods.
 * 
 * Every object gets its own copy.
 */

class StudentExample {

    int age;

    public static void main(String[] args) {

        StudentExample s1 = new StudentExample();
        StudentExample s2 = new StudentExample();

        s1.age = 20;
        s2.age = 25;

        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

// STATIC VARIABLE

/*
 * A static variable belongs to the class rather than individual
 * objects.
 * 
 * It is declared using static.
 */

class StaticVariableExample {

    static String college = "ABC College";

    public static void main(String[] args) {

        System.out.println(college);
    }
}

// 12. VARIABLE NAMING RULES

/*
 * Valid:
 * 
 * int age;
 * int studentAge;
 * int _marks;
 * int $salary;
 * 
 * 
 * Invalid:
 * 
 * int 2age; // Cannot start with digit
 * int student age; // Space not allowed
 * int class; // Keyword cannot be used
 * 
 * 
 * Java is case-sensitive:
 * 
 * age
 * Age
 * AGE
 * 
 * These are different identifiers.
 */

// 13. LITERALS

/*
 * A literal is a fixed value written directly in the program.
 * 
 * Examples:
 * 
 * 10 -> integer literal
 * 10.5 -> double literal
 * 10.5f -> float literal
 * 100L -> long literal
 * 'A' -> character literal
 * "Hello" -> String literal
 * true -> boolean literal
 */

// CODE: LITERALS

class LiteralExample {
    public static void main(String[] args) {

        int a = 10;
        double b = 10.5;
        float c = 10.5f;
        long d = 100000L;
        char e = 'A';
        String f = "Hello";
        boolean g = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}

// 14. OPERATORS

/*
 * Operators are symbols used to perform operations.
 * 
 * Main types:
 * 
 * 1. Arithmetic
 * 2. Relational
 * 3. Logical
 * 4. Assignment
 * 5. Unary
 * 6. Bitwise
 * 7. Ternary
 */

// 15. ARITHMETIC OPERATORS

/*
 * +
 * -
 *
 * /
 * %
 * 
 * Example:
 */

class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1
    }
}

/*
 * IMPORTANT:
 * 
 * 10 / 3 = 3
 * 
 * because both operands are integers.
 * 
 * 10.0 / 3 = 3.333...
 * 
 * because one operand is double.
 */

// 16. RELATIONAL OPERATORS

/*
 * >
 * <
 * >=
 * <=
 * ==
 * !=
 * 
 * Relational operators return boolean values.
 */

class RelationalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}

// 17. LOGICAL OPERATORS

/*
 * && -> AND
 * || -> OR
 * ! -> NOT
 */

class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;

        System.out.println(age >= 18 && age <= 60);

        System.out.println(age < 18 || age > 60);

        System.out.println(!(age >= 18));
    }
}

// 18. ASSIGNMENT OPERATORS

/*
 * =
 * +=
 * -=
 * =
 * /=
 * %=
 * 
 * Example:
 */

class AssignmentOperators {
    public static void main(String[] args) {

        int x = 10;

        x += 5; // x = x + 5
        System.out.println(x);

        x -= 3; // x = x - 3
        System.out.println(x);

        x *= 2; // x = x * 2
        System.out.println(x);

        x /= 4; // x = x / 4
        System.out.println(x);

        x %= 3; // x = x % 3
        System.out.println(x);
    }
}

// 19. UNARY OPERATORS

/*
 * ++
 * --
 * +
 * -
 * !
 * 
 * Unary operators work on one operand.
 */

// PRE-INCREMENT

/*
 * ++x
 * 
 * First increments the value,
 * then uses the value.
 */

class PreIncrement {
    public static void main(String[] args) {

        int x = 5;

        int y = ++x;

        System.out.println(x); // 6
        System.out.println(y); // 6
    }
}

// POST-INCREMENT

/*
 * x++
 * 
 * First uses the value,
 * then increments it.
 */

class PostIncrement {
    public static void main(String[] args) {

        int x = 5;

        int y = x++;

        System.out.println(x); // 6
        System.out.println(y); // 5
    }
}

// PRE-DECREMENT

class PreDecrement {
    public static void main(String[] args) {

        int x = 5;

        int y = --x;

        System.out.println(x); // 4
        System.out.println(y); // 4
    }
}

// POST-DECREMENT

class PostDecrement {
    public static void main(String[] args) {

        int x = 5;

        int y = x--;

        System.out.println(x); // 4
        System.out.println(y); // 5
    }
}

// 20. TERNARY OPERATOR

/*
 * Syntax:
 * 
 * condition ? value1 : value2
 * 
 * It is a short form of if-else.
 */

class TernaryOperator {
    public static void main(String[] args) {

        int age = 20;

        String result = age >= 18
                ? "Adult"
                : "Minor";

        System.out.println(result);
    }
}

// 21. BITWISE OPERATORS

/*
 * &
 * |
 * ^
 * ~
 * 
 * Used to perform operations at bit level.
 */

class BitwiseOperators {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
    }
}

// 22. TYPE CASTING

/*
 * Type casting means converting one data type into another.
 * 
 * Two types:
 * 
 * 1. Widening Casting
 * 2. Narrowing Casting
 */

// WIDENING CASTING

/*
 * Smaller type -> Larger type
 * 
 * Example:
 * 
 * int -> double
 * 
 * Usually happens automatically.
 */

class WideningCasting {
    public static void main(String[] args) {

        int x = 10;

        double y = x;

        System.out.println(y);
    }
}

// NARROWING CASTING

/*
 * Larger type -> Smaller type
 * 
 * Requires explicit casting.
 */

class NarrowingCasting {
    public static void main(String[] args) {

        double x = 10.75;

        int y = (int) x;

        System.out.println(y); // 10
    }
}

// 23. TYPE PROMOTION

/*
 * During arithmetic operations:
 * 
 * byte + byte -> int
 * short + short -> int
 * char + char -> int
 * 
 * Example:
 */

class TypePromotion {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        int c = a + b;

        System.out.println(c);
    }
}

/*
 * This will NOT work:
 * 
 * byte c = a + b;
 * 
 * because a + b produces int.
 */

// 24. CHARACTER AND ARITHMETIC

class CharacterArithmetic {
    public static void main(String[] args) {

        char ch = 'A';

        System.out.println(ch + 1);
    }
}

/*
 * Output:
 * 
 * 66
 * 
 * Because 'A' has Unicode value 65,
 * and 65 + 1 = 66.
 */

// QUESTIONS

// Q1. BASIC JAVA PROGRAM

/*
 * Question:
 * 
 * Write a Java program to print:
 * 
 * Hello Java
 * Welcome to Programming
 */

class Q1_BasicProgram {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.println("Welcome to Programming");
    }
}

// Q2. JDK, JRE AND JVM

/*
 * Question:
 * 
 * Explain the difference between JDK, JRE and JVM.
 * 
 * Solution:
 * 
 * JDK -> Used to develop and run Java applications.
 * JRE -> Provides environment to run Java applications.
 * JVM -> Executes Java bytecode.
 * 
 * Relationship:
 * 
 * JDK
 * |
 * v
 * JRE
 * |
 * v
 * JVM
 */

// Q3. PRINT ALL PRIMITIVE DATA TYPES

/*
 * Question:
 * 
 * Create variables of all 8 primitive data types and print them.
 */

class Q3_PrimitiveTypes {
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40L;
        float e = 50.5f;
        double f = 60.5;
        char g = 'A';
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}

// Q4. SUM OF TWO NUMBERS

/*
 * Question:
 * 
 * Take two integers and print their sum.
 */

import java.util.Scanner;

class Q4_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        sc.close();
    }
}

// Q5. ALL ARITHMETIC OPERATIONS

/*
 * Question:
 * 
 * Take two integers and perform:
 * 
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Remainder
 */

class Q5_Arithmetic {
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));
    }
}

// Q6. EVEN OR ODD

/*
 * Question:
 * 
 * Check whether a number is even or odd.
 */

class Q6_EvenOdd {
    public static void main(String[] args) {

        int n = 24;

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// Q7. POSITIVE, NEGATIVE OR ZERO

/*
 * Question:
 * 
 * Check whether a number is positive, negative or zero.
 */

class Q7_NumberSign {
    public static void main(String[] args) {

        int n = -10;

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

// Q8. FIND MAXIMUM USING TERNARY OPERATOR

/*
 * Question:
 * 
 * Find the maximum of two numbers using the ternary operator.
 */

class Q8_Maximum {
    public static void main(String[] args) {

        int a = 50;
        int b = 80;

        int max = (a > b) ? a : b;

        System.out.println(max);
    }
}

// Q9. PRE-INCREMENT VS POST-INCREMENT

/*
 * Question:
 * 
 * Find the output.
 */

class Q9_Increment {
    public static void main(String[] args) {

        int x = 5;

        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);
    }
}

/*
 * Solution:
 * 
 * First:
 * x++ -> prints 5
 * x becomes 6
 * 
 * Second:
 * ++x -> x becomes 7
 * prints 7
 * 
 * Final:
 * x = 7
 * 
 * Output:
 * 
 * 5
 * 7
 * 7
 */

// Q10. OUTPUT QUESTION

/*
 * Question:
 * 
 * What is the output?
 * 
 * int x = 10;
 * int y = x++;
 * System.out.println(x);
 * System.out.println(y);
 */

/*
 * Solution:
 * 
 * x++ uses 10 first.
 * Then x becomes 11.
 * 
 * Output:
 * 
 * 11
 * 10
 */

// Q11. OUTPUT QUESTION

/*
 * Question:
 * 
 * What is the output?
 * 
 * int x = 10;
 * int y = ++x;
 * System.out.println(x);
 * System.out.println(y);
 */

/*
 * Solution:
 * 
 * ++x increments first.
 * 
 * x = 11
 * y = 11
 * 
 * Output:
 * 
 * 11
 * 11
 */

// Q12. INTEGER DIVISION

/*
 * Question:
 * 
 * What is the output?
 * 
 * System.out.println(10 / 3);
 * System.out.println(10.0 / 3);
 */

/*
 * Solution:
 * 
 * 10 / 3
 * Both are integers.
 * Result = 3
 * 
 * 10.0 / 3
 * One operand is double.
 * Result = 3.333333...
 * 
 * Output:
 * 
 * 3
 * 3.3333333333333335
 */

// Q13. TYPE CASTING

/*
 * Question:
 * 
 * Convert a double into an int.
 */

class Q13_TypeCasting {
    public static void main(String[] args) {

        double number = 25.75;

        int result = (int) number;

        System.out.println(result);
    }
}

/*
 * Output:
 * 
 * 25
 * 
 * The decimal portion is removed.
 */

// Q14. CHARACTER ARITHMETIC

/*
 * Question:
 * 
 * What is the output?
 * 
 * char ch = 'A';
 * System.out.println(ch + 1);
 */

/*
 * Solution:
 * 
 * 'A' = 65
 * 
 * 65 + 1 = 66
 * 
 * Output:
 * 
 * 66
 */

// Q15. TYPE PROMOTION

/*
 * Question:
 * 
 * What is the data type of the result?
 * 
 * byte a = 10;
 * byte b = 20;
 * 
 * int c = a + b;
 * 
 * Solution:
 * 
 * a + b is promoted to int.
 * 
 * Therefore:
 * 
 * int c = a + b;
 * 
 * is valid.
 */

// Q16. CHECK VALID VARIABLE DECLARATIONS

/*
 * Question:
 * 
 * Identify valid and invalid declarations.
 * 
 * 1. int age = 20;
 * 2. int 2age = 20;
 * 3. int studentAge = 20;
 * 4. int student age = 20;
 * 5. int _marks = 90;
 * 6. int class = 10;
 * 
 * Solution:
 * 
 * 1. Valid
 * 2. Invalid
 * 3. Valid
 * 4. Invalid
 * 5. Valid
 * 6. Invalid
 */

// Q17. SIMPLE INTEREST

/*
 * Question:
 * 
 * Calculate Simple Interest.
 * 
 * Formula:
 * 
 * SI = (P * R * T) / 100
 */

class Q17_SimpleInterest {
    public static void main(String[] args) {

        double p = 10000;
        double r = 5;
        double t = 2;

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}

// Q18. CELSIUS TO FAHRENHEIT

/*
 * Question:
 * 
 * Convert Celsius to Fahrenheit.
 * 
 * Formula:
 * 
 * F = (C * 9 / 5) + 32
 */

class Q18_Temperature {
    public static void main(String[] args) {

        double celsius = 25;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit);
    }
}

// Q19. SWAP TWO NUMBERS

/*
 * Question:
 * 
 * Swap two numbers using a third variable.
 */

class Q19_Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp = a;

        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// Q20. COMBINED OPERATOR QUESTION

/*
 * Question:
 * 
 * Find the output.
 */

class Q20_CombinedOperators {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        System.out.println(a++ + ++b);
    }
}

/*
 * Solution:
 * 
 * a++ -> uses 5, then a = 6
 * 
 * ++b -> b becomes 3, then uses 3
 * 
 * 5 + 3 = 8
 * 
 * Output:
 * 
 * 8
 */

// Q21. LOGICAL OPERATOR QUESTION

/*
 * Question:
 * 
 * Find the output.
 */

class Q21_LogicalOperators {
    public static void main(String[] args) {

        int age = 20;

        boolean result = age >= 18 && age <= 60;

        System.out.println(result);
    }
}

/*
 * Solution:
 * 
 * 20 >= 18 -> true
 * 20 <= 60 -> true
 * 
 * true && true -> true
 * 
 * Output:
 * 
 * true
 */

// Q22. RELATIONAL OPERATOR QUESTION

/*
 * Question:
 * 
 * What is the output?
 * 
 * int a = 10;
 * int b = 20;
 * 
 * System.out.println(a > b);
 * System.out.println(a < b);
 * System.out.println(a == b);
 * System.out.println(a != b);
 */

/*
 * Solution:
 * 
 * false
 * true
 * false
 * true
 */

// Q23. COMPOUND ASSIGNMENT

class Q23_Assignment {
    public static void main(String[] args) {

        int x = 10;

        x += 5;
        x *= 2;
        x -= 4;

        System.out.println(x);
    }
}

/*
 * Solution:
 * 
 * x = 10
 * 
 * x += 5
 * x = 15
 * 
 * x *= 2
 * x = 30
 * 
 * x -= 4
 * x = 26
 * 
 * Output:
 * 
 * 26
 */

// Q24. CHARACTER COMPARISON

class Q24_Character {
    public static void main(String[] args) {

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else
            System.out.println("Not Uppercase");
    }
}

// Q25. CALCULATE AVERAGE

/*
 * Question:
 * 
 * Take three numbers and calculate their average.
 */

class Q25_Average {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        double average = (a + b + c) / 3.0;

        System.out.println("Average = " + average);
    }
}

// Q26. SWAP WITHOUT THIRD VARIABLE

class Q26_SwapWithoutVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// Q27. CHECK LEAP YEAR

/*
 * Question:
 * 
 * Check whether a year is a leap year.
 * 
 * Condition:
 * 
 * year % 400 == 0
 * OR
 * year % 4 == 0 AND year % 100 != 0
 */

class Q27_LeapYear {
    public static void main(String[] args) {

        int year = 2024;

        if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {

            System.out.println("Leap Year");

        } else {

            System.out.println("Not a Leap Year");
        }
    }
}

// Q28. LARGEST OF THREE NUMBERS

class Q28_LargestThree {
    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int c = 30;

        int largest;

        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest = " + largest);
    }
}

// Q29. NUMBER OF DIGITS

class Q29_CountDigits {
    public static void main(String[] args) {

        int n = 12345;

        int count = 0;

        while (n != 0) {

            n = n / 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}

// Q30. REVERSE A NUMBER

class Q30_ReverseNumber {
    public static void main(String[] args) {

        int n = 12345;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}

/*
 * ============================================================
 * MOST IMPORTANT EXAM POINTS
 * ============================================================
 * 
 * 1. Java follows WORA:
 * Write Once, Run Anywhere.
 * 
 * 2. .java = source code.
 * 
 * 3. .class = bytecode.
 * 
 * 4. javac = compiler.
 * 
 * 5. JVM = executes bytecode.
 * 
 * 6. JRE = runtime environment.
 * 
 * 7. JDK = development kit.
 * 
 * 8. Relationship:
 * 
 * JDK
 * |
 * v
 * JRE
 * |
 * v
 * JVM
 * 
 * 9. Java has 8 primitive data types:
 * 
 * byte
 * short
 * int
 * long
 * float
 * double
 * char
 * boolean
 * 
 * 10. int = 32 bits.
 * 
 * 11. long = 64 bits.
 * 
 * 12. float = 32 bits.
 * 
 * 13. double = 64 bits.
 * 
 * 14. char = 16 bits.
 * 
 * 15. String is NOT a primitive data type.
 * 
 * 16. Local variables must be initialized before use.
 * 
 * 17. Instance variables get default values.
 * 
 * 18. Static variables belong to the class.
 * 
 * 19. Decimal literals are double by default.
 * 
 * 20. float requires 'f':
 * 
 * float x = 10.5f;
 * 
 * 21. long literals can use L:
 * 
 * long x = 100000L;
 * 
 * 22. == is the equality operator.
 * 
 * 23. = is the assignment operator.
 * 
 * 24. % gives remainder.
 * 
 * 25. && = AND.
 * 
 * 26. || = OR.
 * 
 * 27. ! = NOT.
 * 
 * 28. x++:
 * Use first, increment later.
 * 
 * 29. ++x:
 * Increment first, use later.
 * 
 * 30. Widening casting is generally automatic.
 * 
 * 31. Narrowing casting requires explicit casting.
 * 
 * 32. byte + byte produces int.
 * 
 * 33. short + short produces int.
 * 
 * 34. char + char produces int.
 * 
 * 35. 10 / 3 = 3.
 * 
 * 36. 10.0 / 3 = 3.333...
 * 
 * 37. Ternary syntax:
 * 
 * condition ? value1 : value2;
 * 
 * ============================================================
 */