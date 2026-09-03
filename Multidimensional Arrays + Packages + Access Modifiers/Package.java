package Multidimensional Arrays+Packages+Access Modifiers;

public class Package {

    // ACCESS MODIFIERS

    // private → accessible only inside this class
    private int privateMarks = 90;

    // default → accessible within the same package
    int defaultMarks = 80;

    // protected → same package + subclasses
    protected int protectedMarks = 70;

    // public → accessible everywhere
    public int publicMarks = 60;

    // PUBLIC METHOD

    public void displayInsideClass() {

        System.out.println("Inside Student class:");

        System.out.println("Private: " + privateMarks);
        System.out.println("Default: " + defaultMarks);
        System.out.println("Protected: " + protectedMarks);
        System.out.println("Public: " + publicMarks);
    }

    // PRIVATE METHOD

    private void privateMethod() {
        System.out.println("Private method");
    }

    // PUBLIC METHOD CAN ACCESS PRIVATE METHOD
    public void callPrivateMethod() {
        privateMethod();
    }
}

/*
 * ============================================================
 * PACKAGE + ACCESS MODIFIERS
 * IMPORTANT CODING QUESTIONS
 * ============================================================
 */

================
// Q41. Demonstrate all four access modifiers.
================
// Question:
// Create a class containing private, default, protected
// and public variables and access them inside the same class.
================

class Q41_AllAccessModifiers {

    private int privateValue = 10;

    int defaultValue = 20;

    protected int protectedValue = 30;

    public int publicValue = 40;

    void display() {

        System.out.println("Private: " + privateValue);
        System.out.println("Default: " + defaultValue);
        System.out.println("Protected: " + protectedValue);
        System.out.println("Public: " + publicValue);
    }

    public static void main(String[] args) {

        Q41_AllAccessModifiers obj = new Q41_AllAccessModifiers();

        obj.display();
    }
}

================
// Q42. Demonstrate private access.
================
// Question:
// Create a private variable and access it using a method.
================

class Q42_PrivateAccess {

    private int marks = 90;

    public void displayMarks() {

        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Q42_PrivateAccess obj = new Q42_PrivateAccess();

        obj.displayMarks();

        // System.out.println(obj.marks);
        // ERROR: marks is private
    }
}

================
// Q43. Access private variable using getter.
================
// Question:
// Create a private variable and access it using a
// public getter method.
================

class Q43_PrivateGetter {

    private int age = 20;

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {

        Q43_PrivateGetter obj = new Q43_PrivateGetter();

        System.out.println("Age: " + obj.getAge());
    }
}

================
// Q44. Access private variable using setter.
================
// Question:
// Create a private variable and modify it using a
// public setter method.
================

class Q44_PrivateSetter {

    private int marks;

    public void setMarks(int marks) {

        this.marks = marks;
    }

    public int getMarks() {

        return marks;
    }

    public static void main(String[] args) {

        Q44_PrivateSetter obj = new Q44_PrivateSetter();

        obj.setMarks(95);

        System.out.println("Marks: " + obj.getMarks());
    }
}

================
// Q45. Demonstrate default access.
================
// Question:
// Create a variable without any access modifier.
// Access it from another class in the same file/package.
================

class Q45_DefaultAccess {

    int number = 100;
}

// Another class in the same package
class Q45_Main {

    public static void main(String[] args) {

        Q45_DefaultAccess obj = new Q45_DefaultAccess();

        System.out.println("Number: " + obj.number);
    }
}

================
// Q46. Demonstrate protected access through inheritance.
================
// Question:
// Create a parent class with a protected variable.
// Access it from a child class.
================

class Q46_Parent {

    protected int marks = 80;
}

class Q46_Child extends Q46_Parent {

    public void display() {

        System.out.println("Protected Marks: " + marks);
    }

    public static void main(String[] args) {

        Q46_Child obj = new Q46_Child();

        obj.display();
    }
}

================
// Q47. Demonstrate public access.
================
// Question:
// Create a public variable and access it from another class.
================

class Q47_PublicClass {

    public int number = 100;
}

class Q47_Main {

    public static void main(String[] args) {

        Q47_PublicClass obj = new Q47_PublicClass();

        System.out.println("Public Number: " + obj.number);
    }
}

================
// Q48. Demonstrate a private method.
================
// Question:
// Create a private method and call it through a public method.
================

class Q48_PrivateMethod {

    private void display() {

        System.out.println("Private method called");
    }

    public void callMethod() {

        display();
    }

    public static void main(String[] args) {

        Q48_PrivateMethod obj = new Q48_PrivateMethod();

        obj.callMethod();

        // obj.display();
        // ERROR: display() is private
    }
}

================
// Q49. Encapsulation using private data.
================
// Question:
// Create a class with private variables and use getter
// and setter methods to access them.
================

class Q49_Encapsulation {

    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {

        Q49_Encapsulation obj = new Q49_Encapsulation();

        obj.setName("John");
        obj.setAge(20);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}

================
// Q50. Access modifier with inheritance.
================
// Question:
// Create a parent class containing private, default,
// protected and public variables.
// Access them from a child class.
================

class Q50_Parent {

    private int privateValue = 10;

    int defaultValue = 20;

    protected int protectedValue = 30;

    public int publicValue = 40;
}

class Q50_Child extends Q50_Parent {

    public void display() {

        // System.out.println(privateValue);
        // ERROR: private cannot be accessed directly

        System.out.println("Default: " + defaultValue);

        System.out.println("Protected: " + protectedValue);

        System.out.println("Public: " + publicValue);
    }

    public static void main(String[] args) {

        Q50_Child obj = new Q50_Child();

        obj.display();
    }
}

================
// Q51. Access a private member indirectly.
================
// Question:
// Demonstrate that a private variable cannot be accessed
// directly, but can be accessed through a public method.
================

class Q51_PrivateIndirect {

    private int balance = 5000;

    public int getBalance() {

        return balance;
    }

    public static void main(String[] args) {

        Q51_PrivateIndirect obj = new Q51_PrivateIndirect();

        System.out.println(
                "Balance: " + obj.getBalance());
    }
}

================
// Q52. Modify protected variable through inheritance.
================
// Question:
// Create a protected variable in parent class and modify
// it inside the child class.
================

class Q52_Parent {

    protected int value = 50;
}

class Q52_Child extends Q52_Parent {

    public void changeValue() {

        value = 100;
    }

    public void display() {

        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        Q52_Child obj = new Q52_Child();

        obj.display();

        obj.changeValue();

        obj.display();
    }
}

================
// Q53. Access all modifiers and identify errors.
================
// Question:
// Identify which members can be accessed directly from
// another class.
================

class Q53_Test {

    private int a = 10;

    int b = 20;

    protected int c = 30;

    public int d = 40;
}

class Q53_Main {

    public static void main(String[] args) {

        Q53_Test obj = new Q53_Test();

        // System.out.println(obj.a);
        // ❌ private

        System.out.println(obj.b);
        // ✅ default - same package

        System.out.println(obj.c);
        // ✅ protected - same package

        System.out.println(obj.d);
        // ✅ public
    }
}