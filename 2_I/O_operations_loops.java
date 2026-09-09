/*
============================================================
 INPUT / OUTPUT + COMMENTS
 CONTROL STATEMENTS + LOOPS
 NOTES + ONE COMBINED CODE + BASIC QUESTIONS
============================================================
*/


// ============================================================
// NOTES
// CONTENT TOPIC WISE
// ============================================================


// ============================================================
// 1. INPUT AND OUTPUT IN JAVA
// ============================================================

/*
Input means taking data from the user.

Output means displaying information on the screen.

Java commonly uses Scanner for taking input.

Import:

import java.util.Scanner;

Create Scanner object:

Scanner sc = new Scanner(System.in);
*/


// ============================================================
// 2. OUTPUT USING System.out.println()
// ============================================================

/*
println() prints the output and moves the cursor to the next line.

Example:

System.out.println("Hello");
System.out.println("Java");

Output:

Hello
Java
*/


// ============================================================
// 3. OUTPUT USING System.out.print()
// ============================================================

/*
print() prints the output but does NOT move to the next line.

Example:

System.out.print("Hello ");
System.out.print("Java");

Output:

Hello Java
*/


// ============================================================
// 4. OUTPUT USING System.out.printf()
// ============================================================

/*
printf() is used for formatted output.

Common format specifiers:

%d -> integer
%f -> floating-point number
%c -> character
%s -> String
%b -> boolean

Example:

int age = 20;

System.out.printf("Age = %d", age);
*/


// ============================================================
// 5. TAKING INTEGER INPUT
// ============================================================

/*
nextInt() is used to read an integer.

int n = sc.nextInt();
*/


// ============================================================
// 6. TAKING DECIMAL INPUT
// ============================================================

/*
nextDouble() -> double
nextFloat()  -> float
nextLong()   -> long
*/


// ============================================================
// 7. TAKING STRING INPUT
// ============================================================

/*
next() reads a single word.

String name = sc.next();

nextLine() reads the complete line, including spaces.

String name = sc.nextLine();
*/


// ============================================================
// 8. TAKING CHARACTER INPUT
// ============================================================

/*
Scanner does not have nextChar().

To read a character:

char ch = sc.next().charAt(0);
*/


// ============================================================
// 9. COMMENTS
// ============================================================

/*
Comments are ignored by the compiler.

They are used to explain code and improve readability.

Three types:

1. Single-line comment
2. Multi-line comment
3. Documentation comment
*/


// Single-line comment

/*
Multi-line
comment
*/


/**
 * Documentation comment.
 *
 * Used for generating Java documentation.
 */


// ============================================================
// 10. CONTROL STATEMENTS
// ============================================================

/*
Control statements control the flow of program execution.

Main types:

1. Decision-making statements
2. Looping / Iterative statements
3. Jump statements


Decision-making:

if
if-else
else-if
nested if
switch


Loops:

for
while
do-while


Jump statements:

break
continue
return
*/


// ============================================================
// 11. if STATEMENT
// ============================================================

/*
Syntax:

if (condition) {
    // statements
}

The statements execute only when the condition is true.
*/


// ============================================================
// 12. if-else STATEMENT
// ============================================================

/*
Syntax:

if (condition) {
    // true
} else {
    // false
}
*/


// ============================================================
// 13. else-if LADDER
// ============================================================

/*
Used when multiple conditions need to be checked.

Syntax:

if (condition1) {
}
else if (condition2) {
}
else {
}
*/


// ============================================================
// 14. NESTED if
// ============================================================

/*
An if statement inside another if statement.

Example:

if (condition1) {
    if (condition2) {
    }
}
*/


// ============================================================
// 15. switch STATEMENT
// ============================================================

/*
switch is useful when one expression needs to be compared
with multiple constant cases.

Syntax:

switch (expression) {

    case value1:
        statements;
        break;

    case value2:
        statements;
        break;

    default:
        statements;
}

break prevents execution from continuing into the next case.
*/


// ============================================================
// 16. for LOOP
// ============================================================

/*
Used when the number of iterations is generally known.

Syntax:

for (initialization; condition; update) {
    // statements
}

Example:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
*/


// ============================================================
// 17. while LOOP
// ============================================================

/*
A while loop checks the condition BEFORE executing the body.

Syntax:

while (condition) {
    // statements
}

If the condition is false initially,
the loop may execute zero times.
*/


// ============================================================
// 18. do-while LOOP
// ============================================================

/*
A do-while loop executes the body FIRST
and checks the condition afterward.

Therefore, it executes at least once.

Syntax:

do {
    // statements
} while (condition);
*/


// ============================================================
// 19. ENHANCED FOR LOOP
// ============================================================

/*
Enhanced for loop is commonly used to traverse arrays
and collections.

Syntax:

for (dataType variable : array) {
    // statements
}

Example:

int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
*/


// ============================================================
// 20. break
// ============================================================

/*
break immediately terminates the loop or switch.
*/


// ============================================================
// 21. continue
// ============================================================

/*
continue skips the current iteration
and moves to the next iteration.
*/


// ============================================================
// 22. return
// ============================================================

/*
return terminates the current method and can return a value.

Example:

return value;
*/


// ============================================================
// CODES RELATED TO THE CONTENT
// ONE COMBINED PROGRAM
// ============================================================

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ====================================================
        // INPUT
        // ====================================================

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


        // ====================================================
        // if-else
        // ====================================================

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // ====================================================
        // else-if ladder
        // ====================================================

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 60) {
            System.out.println("Grade C");
        }
        else if (marks >= 40) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }


        // ====================================================
        // switch
        // ====================================================

        System.out.print("Enter day number (1-3): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }


        // ====================================================
        // for LOOP
        // ====================================================

        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // ====================================================
        // while LOOP
        // ====================================================

        System.out.println("While Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // ====================================================
        // do-while LOOP
        // ====================================================

        System.out.println("Do-While Loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);


        // ====================================================
        // break
        // ====================================================

        System.out.println("Break Example:");

        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                break;
            }

            System.out.println(k);
        }


        // ====================================================
        // continue
        // ====================================================

        System.out.println("Continue Example:");

        for (int k = 1; k <= 5; k++) {

            if (k == 3) {
                continue;
            }

            System.out.println(k);
        }


        // ====================================================
        // ENHANCED FOR LOOP
        // ====================================================

        int[] numbers = {10, 20, 30, 40};

        System.out.println("Enhanced For Loop:");

        for (int number : numbers) {
            System.out.println(number);
        }


        // ====================================================
        // printf()
        // ====================================================

        System.out.printf("Name = %s, Age = %d%n", name, age);

        sc.close();
    }
}


// ============================================================
// QUESTIONS
// BASIC QUESTIONS AT THE END
// ============================================================


// ============================================================
// Q1. PRINT HELLO JAVA
// ============================================================

/*
Question:

Write a program to print:

Hello Java
Welcome to Programming
*/

class Q1_HelloJava {

    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.println("Welcome to Programming");
    }
}


// ============================================================
// Q2. TAKE INTEGER INPUT
// ============================================================

/*
Question:

Take an integer from the user and print it.
*/

class Q2_IntegerInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Number = " + n);

        sc.close();
    }
}


// ============================================================
// Q3. ADD TWO NUMBERS
// ============================================================

/*
Question:

Take two integers as input and print their sum.
*/

class Q3_AddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));

        sc.close();
    }
}


// ============================================================
// Q4. EVEN OR ODD
// ============================================================

/*
Question:

Take a number and check whether it is even or odd.
*/

class Q4_EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        sc.close();
    }
}


// ============================================================
// Q5. POSITIVE, NEGATIVE OR ZERO
// ============================================================

/*
Question:

Check whether a number is positive, negative or zero.
*/

class Q5_NumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        }
        else if (n < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        sc.close();
    }
}


// ============================================================
// Q6. LARGEST OF TWO NUMBERS
// ============================================================

/*
Question:

Take two numbers and print the largest.
*/

class Q6_LargestTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        sc.close();
    }
}


// ============================================================
// Q7. LARGEST OF THREE NUMBERS
// ============================================================

/*
Question:

Find the largest among three numbers.
*/

class Q7_LargestThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        }
        else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
}


// ============================================================
// Q8. GRADE USING ELSE-IF
// ============================================================

/*
Question:

Take marks and print:

90-100 -> A
75-89  -> B
60-74  -> C
40-59  -> D
Below 40 -> Fail
*/

class Q8_Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        }
        else if (marks >= 75) {
            System.out.println("B");
        }
        else if (marks >= 60) {
            System.out.println("C");
        }
        else if (marks >= 40) {
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}


// ============================================================
// Q9. PRINT 1 TO 10 USING FOR LOOP
// ============================================================

class Q9_ForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }
}


// ============================================================
// Q10. PRINT EVEN NUMBERS FROM 1 TO 20
// ============================================================

class Q10_EvenNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


// ============================================================
// Q11. SUM OF 1 TO N
// ============================================================

/*
Question:

Take n and calculate:

1 + 2 + 3 + ... + n
*/

class Q11_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}


// ============================================================
// Q12. MULTIPLICATION TABLE
// ============================================================

/*
Question:

Print the multiplication table of a number from 1 to 10.
*/

class Q12_Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(
                    n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}


// ============================================================
// Q13. FACTORIAL
// ============================================================

/*
Question:

Find the factorial of a number.

Example:

5! = 5 * 4 * 3 * 2 * 1 = 120
*/

class Q13_Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}


// ============================================================
// Q14. REVERSE A NUMBER
// ============================================================

class Q14_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}


// ============================================================
// Q15. COUNT DIGITS
// ============================================================

class Q15_CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {

            n /= 10;
            count++;
        }

        System.out.println("Digits = " + count);

        sc.close();
    }
}


// ============================================================
// Q16. SUM OF DIGITS
// ============================================================

class Q16_SumDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {

            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}


// ============================================================
// Q17. PALINDROME NUMBER
// ============================================================

/*
Question:

Check whether a number is a palindrome.

Example:

121 -> Palindrome
123 -> Not Palindrome
*/

class Q17_Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}


// ============================================================
// Q18. PRIME NUMBER
// ============================================================

/*
Question:

Check whether a number is prime.
*/

class Q18_Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean prime = true;

        if (n < 2) {
            prime = false;
        }
        else {

            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {

                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}


// ============================================================
// Q19. SWITCH CALCULATOR
// ============================================================

/*
Question:

Take two numbers and an operator (+, -, *, /).
Use switch to perform the operation.
*/

class Q19_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double b = sc.nextDouble();

        switch (operator) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                }
                else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}


// ============================================================
// Q20. BREAK
// ============================================================

/*
Question:

Print numbers from 1 to 10, but stop when the number
becomes 6.
*/

class Q20_Break {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }
    }
}


// ============================================================
// Q21. CONTINUE
// ============================================================

/*
Question:

Print numbers from 1 to 10 but skip 5.
*/

class Q21_Continue {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}


// ============================================================
// Q22. DO-WHILE LOOP
// ============================================================

/*
Question:

Print numbers from 1 to 5 using do-while.
*/

class Q22_DoWhile {

    public static void main(String[] args) {

        int i = 1;

        do {

            System.out.println(i);

            i++;

        } while (i <= 5);
    }
}


// ============================================================
// Q23. ENHANCED FOR LOOP
// ============================================================

/*
Question:

Print all elements of an integer array using enhanced
for loop.
*/

class Q23_EnhancedFor {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {

            System.out.println(number);
        }
    }
}


// ============================================================
// Q24. COUNT EVEN AND ODD NUMBERS
// ============================================================

/*
Question:

Count how many even and odd numbers are present in an array.
*/

class Q24_EvenOddCount {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}


/*
============================================================
 IMPORTANT EXAM POINTS
============================================================

INPUT:

Scanner sc = new Scanner(System.in);

nextInt()    -> int
nextDouble() -> double
nextFloat()  -> float
nextLong()   -> long
next()       -> one word
nextLine()   -> complete line
next().charAt(0) -> character


OUTPUT:

System.out.print()
    -> prints without moving to next line

System.out.println()
    -> prints and moves to next line

System.out.printf()
    -> formatted output


COMMENTS:

// Single line

/*
   Multi-line
*/

/**
 * Documentation comment
 */


CONTROL STATEMENTS:

if
if-else
else-if
nested if
switch


LOOPS:

for
while
do-while
enhanced for


JUMP STATEMENTS:

break
continue
return


IMPORTANT DIFFERENCE:

for:
Used when the number of iterations is generally known.

while:
Condition is checked before execution.

do-while:
Body executes first.
Therefore it executes at least once.


BREAK:

Terminates the loop/switch completely.


CONTINUE:

Skips the current iteration.


SWITCH:

break is generally used to prevent fall-through
to the next case.


IMPORTANT LOOP PATTERNS:

for (int i = 1; i <= 10; i++)

while (condition) {
    // code
}

do {
    // code
} while (condition);


ENHANCED FOR:

for (int x : array) {
    System.out.println(x);
}


COMMON EXAM TRAPS:

1. Scanner has NO nextChar() method.

2. Use:
   sc.next().charAt(0);

3. next() reads one word.

4. nextLine() reads the complete line.

5. do-while executes at least once.

6. break exits the loop.

7. continue skips one iteration.

8. for loop has:
   initialization
   condition
   update

9. while checks condition BEFORE execution.

10. do-while checks condition AFTER execution.

============================================================
*/