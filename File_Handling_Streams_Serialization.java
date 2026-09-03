
import java.io.*;
import java.util.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient String password;

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
    }
}

class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. FILE WRITING - FileWriter
        // ==========================================

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Java\n");
            writer.write("File Handling\n");
            writer.write("OOPs in Java");

            writer.close();

            System.out.println("File written successfully.");
        }
        catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }


        // ==========================================
        // 2. FILE READING - FileReader
        // ==========================================

        try {
            FileReader reader = new FileReader("data.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        }
        catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }


        // ==========================================
        // 3. BUFFERED READING - BufferedReader
        // ==========================================

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data.txt"));

            String line;

            System.out.println("\n\nReading line by line:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // ==========================================
        // 4. BUFFERED WRITING - BufferedWriter
        // ==========================================

        try {
            BufferedWriter bw =
                new BufferedWriter(new FileWriter("data2.txt"));

            bw.write("First Line");
            bw.newLine();
            bw.write("Second Line");

            bw.close();

            System.out.println("\nData written using BufferedWriter.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // ==========================================
        // 5. BYTE STREAM - FileOutputStream
        // ==========================================

        try {
            FileOutputStream out =
                new FileOutputStream("bytes.txt");

            out.write(65);  // ASCII value of A
            out.write(66);  // ASCII value of B
            out.write(67);  // ASCII value of C

            out.close();

            System.out.println("Bytes written successfully.");
        }
        catch (IOException e) {
            System.out.println("Output error: " + e.getMessage());
        }


        // ==========================================
        // 6. BYTE STREAM - FileInputStream
        // ==========================================

        try {
            FileInputStream in =
                new FileInputStream("bytes.txt");

            int data;

            System.out.println("Reading bytes:");

            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }

            in.close();

        }
        catch (IOException e) {
            System.out.println("\nInput error: " + e.getMessage());
        }


        // ==========================================
        // 7. SERIALIZATION
        // ==========================================

        try {

            Student s =
                new Student(101, "Rahul", "abc123");

            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("student.dat")
                );

            out.writeObject(s);

            out.close();

            System.out.println("\n\nObject serialized successfully.");

        }
        catch (IOException e) {
            System.out.println("Serialization error: "
                               + e.getMessage());
        }


        // ==========================================
        // 8. DESERIALIZATION
        // ==========================================

        try {

            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("student.dat")
                );

            Student s = (Student) in.readObject();

            in.close();

            System.out.println("\nDeserialized object:");

            s.display();

        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: "
                               + e.getMessage());
        }
    }
}

 
// Q1. Create a custom checked exception for invalid age.
 

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}


 
// Q2. Create a custom unchecked exception.
 

class InvalidAmountException extends RuntimeException {

    InvalidAmountException(String message) {
        super(message);
    }
}


 
// Q3. Create a custom exception and throw it when age < 18.
 

class CustomExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Eligible");
    }
}


 
// Q4. Write data into a text file using FileWriter.
 

class WriteFileDemo {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello Java\n");
            writer.write("File handling is easy");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}


 
// Q5. Read a file character-by-character using FileReader.
 

class ReadFileDemo {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("data.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}


 
// Q6. Read a file using BufferedReader.
 

class BufferedReadDemo {

    public static void main(String[] args) {

        try {
            BufferedReader br =
                new BufferedReader(
                    new FileReader("data.txt")
                );

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}


 
// Q7. Append data to an existing file.
 

class AppendFileDemo {

    public static void main(String[] args) {

        try {
            FileWriter writer =
                new FileWriter("data.txt", true);

            writer.write("\nNew line added");

            writer.close();

            System.out.println("Data appended");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q8. Copy a file using byte streams.
 

class CopyFileDemo {

    public static void main(String[] args) {

        try {
            FileInputStream input =
                new FileInputStream("source.txt");

            FileOutputStream output =
                new FileOutputStream("copy.txt");

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied");

        } catch (IOException e) {
            System.out.println("Copy failed");
        }
    }
}


 
// Q9. Write bytes to a file using FileOutputStream.
 

class ByteWriteDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream out =
                new FileOutputStream("numbers.dat");

            out.write(65);
            out.write(66);
            out.write(67);

            out.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q10. Read bytes from a file using FileInputStream.
 

class ByteReadDemo {

    public static void main(String[] args) {

        try {
            FileInputStream input =
                new FileInputStream("numbers.dat");

            int data;

            while ((data = input.read()) != -1) {
                System.out.println(data);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q11. Serialize a Student object.
 

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


class SerializationDemo {

    public static void main(String[] args) {

        Student s =
            new Student("Shubhangi", 95);

        try {
            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("student.dat")
                );

            out.writeObject(s);

            out.close();

            System.out.println("Object serialized");

        } catch (IOException e) {
            System.out.println("Serialization failed");
        }
    }
}


 
// Q12. Deserialize a Student object.
 

class DeserializationDemo {

    public static void main(String[] args) {

        try {
            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("student.dat")
                );

            Student s =
                (Student) in.readObject();

            in.close();

            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);

        } catch (IOException e) {
            System.out.println("IO error");

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}


 
// Q13. Demonstrate transient fields during serialization.
 

class Employee implements Serializable {

    String name;
    int salary;

    transient String password;

    Employee(String name, int salary, String password) {
        this.name = name;
        this.salary = salary;
        this.password = password;
    }
}


class TransientDemo {

    public static void main(String[] args) {

        Employee e =
            new Employee(
                "John",
                50000,
                "abc123"
            );

        try {

            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("employee.dat")
                );

            out.writeObject(e);
            out.close();


            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("employee.dat")
                );

            Employee result =
                (Employee) in.readObject();

            in.close();

            System.out.println(result.name);
            System.out.println(result.salary);

            // transient field becomes null
            System.out.println(result.password);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


 
// Q14. Serialize multiple objects.
 

class MultipleObjectsDemo {

    public static void main(String[] args) {

        try {

            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("objects.dat")
                );

            Student s1 =
                new Student("A", 90);

            Student s2 =
                new Student("B", 85);

            out.writeObject(s1);
            out.writeObject(s2);

            out.close();

            System.out.println("Objects serialized");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q15. Deserialize multiple objects.
 

class ReadMultipleObjectsDemo {

    public static void main(String[] args) {

        try {

            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("objects.dat")
                );

            Student s1 =
                (Student) in.readObject();

            Student s2 =
                (Student) in.readObject();

            in.close();

            System.out.println(
                s1.name + " " + s1.marks
            );

            System.out.println(
                s2.name + " " + s2.marks
            );

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}


 
// Q16. Serialize an ArrayList.
 

class SerializeListDemo {

    public static void main(String[] args) {

        ArrayList<String> names =
            new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");

        try {

            ObjectOutputStream out =
                new ObjectOutputStream(
                    new FileOutputStream("names.dat")
                );

            out.writeObject(names);

            out.close();

            System.out.println("List serialized");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q17. Deserialize an ArrayList.
 

class DeserializeListDemo {

    public static void main(String[] args) {

        try {

            ObjectInputStream in =
                new ObjectInputStream(
                    new FileInputStream("names.dat")
                );

            ArrayList<String> names =
                (ArrayList<String>) in.readObject();

            in.close();

            for (String name : names) {
                System.out.println(name);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}


 
// Q18. Use try-with-resources for file handling.
 

class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (
            BufferedReader br =
                new BufferedReader(
                    new FileReader("data.txt")
                )
        ) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}


 
// Q19. Count lines in a file.
 

class CountLinesDemo {

    public static void main(String[] args) {

        int count = 0;

        try (
            BufferedReader br =
                new BufferedReader(
                    new FileReader("data.txt")
                )
        ) {

            while (br.readLine() != null) {
                count++;
            }

            System.out.println(
                "Number of lines: " + count
            );

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q20. Count characters in a file.
 

class CountCharactersDemo {

    public static void main(String[] args) {

        int count = 0;

        try (
            FileReader reader =
                new FileReader("data.txt")
        ) {

            while (reader.read() != -1) {
                count++;
            }

            System.out.println(
                "Characters: " + count
            );

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


 
// Q21. Custom exception for insufficient balance.
 

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {

    static void withdraw(
        double balance,
        double amount
    ) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        System.out.println(
            "Withdrawal successful"
        );
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}