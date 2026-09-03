
import java.io.IOException;
import java.util.Scanner;

class InvalidAgeException extends Exception {

    // Constructor of custom exception
    InvalidAgeException(String message) {
        super(message);
    }
}

class Main {

    // throws: declares that this method may throw InvalidAgeException
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // throw: explicitly creates and throws an exception
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Calling method that can throw custom exception
            checkAge(age);

            // Another possible runtime exception
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("100 / number = " + (100 / num));
        }

        // Handling our custom exception
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // Handling ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // Handling invalid input
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer!");
        }

        // Executes whether exception occurs or not
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }

        System.out.println("Program continues...");
    }
}


// Q1. Handle ArithmeticException using try-catch.
class ExceptionQuestions {

    public static void main(String[] args) {

        // Q1. Handle division by zero using try-catch.
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }


        // Q2. Handle ArrayIndexOutOfBoundsException.
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }


        // Q3. Handle NullPointerException.
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }


        // Q4. Handle NumberFormatException.
        try {
            String value = "abc";
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }


        // Q5. Use multiple catch blocks.
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (Exception e) {
            System.out.println("Some other exception");
        }


        // Q6. Demonstrate finally.
        try {
            System.out.println("Inside try");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally always executes");
        }


        // Q7. finally executes even when exception occurs.
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally executed");
        }


        // Q8. Use throw to explicitly throw an exception.
        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        // Q9. Create a method using throw to validate age.
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // Q10. Use throws to declare an exception.
        try {
            testThrows();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }


        // Q11. Use throws with IOException.
        try {
            readData();
        } catch (IOException e) {
            System.out.println("IOException handled");
        }


        // Q12. Use getMessage(), getClass() and printStackTrace().
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Class: " + e.getClass().getSimpleName());

            // e.printStackTrace();
        }


        // Q13. Demonstrate exception propagation.
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }


        // Q14. Nested try-catch.
        try {
            System.out.println("Outer try");

            try {
                int x = 10 / 0;
                System.out.println(x);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }

        } catch (Exception e) {
            System.out.println("Outer catch");
        }


        // Q15. Demonstrate return with finally.
        System.out.println(returnExample());


        // Q16. Validate positive number using throw.
        try {
            validateNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // Q17. Check whether a number is valid for division.
        try {
            int result = divide(100, 5);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        // Q18. Handle multiple exceptions using multi-catch.
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }


        // Q19. Handle user input exception.
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            System.out.println("Number = " + number);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }


        // Q20. Demonstrate checked exception using throws.
        try {
            checkedExceptionMethod();
        } catch (Exception e) {
            System.out.println("Checked exception handled");
        }


        // Q21. Demonstrate exception rethrowing.
        try {
            rethrowExample();
        } catch (Exception e) {
            System.out.println("Rethrown exception handled");
        }


        // Q22. Demonstrate custom exception.
        try {
            checkMarks(105);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }


        // Q23. Demonstrate exception hierarchy.
        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");

        } catch (Exception e) {
            System.out.println("Exception caught");
        }


        // Q24. finally with return.
        System.out.println(finallyReturn());


        // Q25. Demonstrate that finally executes before exception propagation.
        try {
            throw new RuntimeException("Something went wrong");
        } finally {
            System.out.println("Cleanup completed");
        }
    }


    // Q9 Solution
    static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }


    // Q10 Solution
    static void testThrows() throws Exception {
        throw new Exception("Something went wrong");
    }


    // Q11 Solution
    static void readData() throws IOException {
        throw new IOException("Unable to read data");
    }


    // Q13 Solution
    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        throw new ArithmeticException("Error propagated");
    }


    // Q15 Solution
    static int returnExample() {

        try {
            return 10;
        } finally {
            System.out.println("Finally executes");
        }
    }


    // Q16 Solution
    static void validateNumber(int number) {

        if (number <= 0) {
            throw new IllegalArgumentException(
                "Number must be positive"
            );
        }

        System.out.println("Valid number");
    }


    // Q17 Solution
    static int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException(
                "Cannot divide by zero"
            );
        }

        return a / b;
    }


    // Q20 Solution
    static void checkedExceptionMethod() throws Exception {

        throw new Exception("Checked exception");
    }


    // Q21 Solution
    static void rethrowExample() throws Exception {

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught first");
            throw e;
        }
    }


    // Q22 Solution
    static void checkMarks(int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Marks must be between 0 and 100"
            );
        }

        System.out.println("Valid marks");
    }


    // Q24 Solution
    static int finallyReturn() {

        try {
            return 10;
        } finally {
            return 20;
        }
    }
}


// Q22. Custom checked exception.
class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}