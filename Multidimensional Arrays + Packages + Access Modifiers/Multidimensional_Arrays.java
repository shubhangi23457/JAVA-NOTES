import college.Student;

public class Multidimensional_Arrays {

    public static void main(String[] args) {

        // ==========================================
        // 1. ONE-DIMENSIONAL ARRAY
        // ==========================================

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("1D Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // ==========================================
        // 2. TWO-DIMENSIONAL ARRAY
        // ==========================================

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n2D Array:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


        // ==========================================
        // 3. ACCESSING A PARTICULAR ELEMENT
        // ==========================================

        System.out.println(
            "\nElement at [1][2]: "
            + matrix[1][2]
        );


        // ==========================================
        // 4. MODIFYING 2D ARRAY
        // ==========================================

        matrix[0][1] = 100;

        System.out.println("\nAfter modification:");

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }


        // ==========================================
        // 5. JAGGED ARRAY
        // ==========================================

        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("\nJagged Array:");

        for (int i = 0; i < jagged.length; i++) {

            for (int j = 0; j < jagged[i].length; j++) {

                System.out.print(jagged[i][j] + " ");
            }

            System.out.println();
        }


        // ==========================================
        // 6. THREE-DIMENSIONAL ARRAY
        // ==========================================

        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("\n3D Array:");

        for (int i = 0; i < cube.length; i++) {

            for (int j = 0; j < cube[i].length; j++) {

                for (int k = 0; k < cube[i][j].length; k++) {

                    System.out.print(cube[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }


        // ==========================================
        // 7. PACKAGE + PUBLIC ACCESS
        // ==========================================

        Student student = new Student();

        student.displayInsideClass();

        System.out.println(
            "\nPublic variable: "
            + student.publicMarks
        );


        // ==========================================
        // 8. PRIVATE ACCESS
        // ==========================================

        // This will NOT compile:

        // System.out.println(student.privateMarks);

        // private members cannot be accessed
        // directly outside Student class.


        // ==========================================
        // 9. DEFAULT ACCESS
        // ==========================================

        // This will NOT compile because Main
        // belongs to a different package:

        // System.out.println(student.defaultMarks);


        // ==========================================
        // 10. PROTECTED ACCESS
        // ==========================================

        // This will also NOT compile here because
        // Main is outside the college package and
        // is not a subclass of Student.

        // System.out.println(student.protectedMarks);


        // ==========================================
        // 11. ACCESSING PRIVATE METHOD INDIRECTLY
        // ==========================================

        student.callPrivateMethod();
    }
}