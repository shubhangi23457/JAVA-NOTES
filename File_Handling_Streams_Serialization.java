import java.io.*;

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