import java.util.*;

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