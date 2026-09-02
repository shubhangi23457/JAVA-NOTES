package Multidimensional Arrays + Packages + Access Modifiers;

public class Package {

    // ==========================================
    // ACCESS MODIFIERS
    // ==========================================

    // private → accessible only inside this class
    private int privateMarks = 90;

    // default → accessible within the same package
    int defaultMarks = 80;

    // protected → same package + subclasses
    protected int protectedMarks = 70;

    // public → accessible everywhere
    public int publicMarks = 60;


    // ==========================================
    // PUBLIC METHOD
    // ==========================================

    public void displayInsideClass() {

        System.out.println("Inside Student class:");

        System.out.println("Private: " + privateMarks);
        System.out.println("Default: " + defaultMarks);
        System.out.println("Protected: " + protectedMarks);
        System.out.println("Public: " + publicMarks);
    }


    // ==========================================
    // PRIVATE METHOD
    // ==========================================

    private void privateMethod() {
        System.out.println("Private method");
    }


    // PUBLIC METHOD CAN ACCESS PRIVATE METHOD
    public void callPrivateMethod() {
        privateMethod();
    }
}