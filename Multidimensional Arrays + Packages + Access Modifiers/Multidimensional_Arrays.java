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



/*
============================================================
IMPORTANT CODING QUESTIONS + SOLUTIONS
============================================================
*/


// 1. PRINT A 2D ARRAY
// Question:
// Create a 2D array and print all its elements.

class Q1_Print2DArray {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}


// 2. PRINT 2D ARRAY USING ENHANCED FOR LOOP
// Question:
// Print all elements of a 2D array using for-each.

class Q2_EnhancedFor {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        for (int[] row : arr) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}


// 3. SUM OF ALL ELEMENTS
// Question:
// Find the sum of all elements in a 2D array.
 

class Q3_SumMatrix {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}


 
// 4. FIND LARGEST ELEMENT
// Question:
// Find the largest element in a 2D array.
 

class Q4_LargestElement {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 25, 3},
            {45, 6, 17},
            {8, 90, 12}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest = " + max);
    }
}


 
// 5. FIND SMALLEST ELEMENT
// Question:
// Find the smallest element in a 2D array.
 

class Q5_SmallestElement {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 25, 3},
            {45, 6, 17},
            {8, 90, 12}
        };

        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Smallest = " + min);
    }
}


 
// 6. ROW SUM
// Question:
// Find the sum of every row in a matrix.
 

class Q6_RowSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }

            System.out.println("Row " + i + " sum = " + sum);
        }
    }
}


 
// 7. COLUMN SUM
// Question:
// Find the sum of every column in a matrix.
 

class Q7_ColumnSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int columns = arr[0].length;

        for (int j = 0; j < columns; j++) {

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {

                sum += arr[i][j];
            }

            System.out.println(
                "Column " + j + " sum = " + sum
            );
        }
    }
}


 
// 8. MAIN DIAGONAL
// Question:
// Find the sum of the main diagonal.
 

class Q8_MainDiagonal {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
        }

        System.out.println("Main diagonal sum = " + sum);
    }
}


 
// 9. SECONDARY DIAGONAL
// Question:
// Find the sum of the secondary diagonal.
 

class Q9_SecondaryDiagonal {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i][n - 1 - i];
        }

        System.out.println("Secondary diagonal sum = " + sum);
    }
}


 
// 10. PRINT MAIN DIAGONAL
// Question:
// Print all elements present on the main diagonal.
 

class Q10_PrintDiagonal {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i][i] + " ");
        }
    }
}


 
// 11. TRANSPOSE OF MATRIX
// Question:
// Print the transpose of a matrix.
 

class Q11_Transpose {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}


 
// 12. MATRIX ADDITION
// Question:
// Add two matrices of the same dimensions.
 

class Q12_MatrixAddition {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                result[i][j] = a[i][j] + b[i][j];

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}


 
// 13. MATRIX SUBTRACTION
// Question:
// Subtract one matrix from another.
 

class Q13_MatrixSubtraction {
    public static void main(String[] args) {

        int[][] a = {
            {10, 20},
            {30, 40}
        };

        int[][] b = {
            {1, 2},
            {3, 4}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                result[i][j] = a[i][j] - b[i][j];

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}


 
// 14. MATRIX MULTIPLICATION
// Question:
// Multiply two matrices.
 

class Q14_MatrixMultiplication {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                for (int k = 0; k < b.length; k++) {

                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int[] row : result) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}


 
// 15. CHECK SYMMETRIC MATRIX
// Question:
// Check whether a square matrix is symmetric.
 

class Q15_SymmetricMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean symmetric = true;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i][j] != a[j][i]) {

                    symmetric = false;
                    break;
                }
            }
        }

        System.out.println(symmetric);
    }
}


 
// 16. SEARCH AN ELEMENT IN 2D ARRAY
// Question:
// Search for a given element and print its position.
 

class Q16_Search2D {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {

                    System.out.println(
                        "Found at [" + i + "][" + j + "]"
                    );

                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Not Found");
    }
}


 
// 17. COUNT EVEN AND ODD ELEMENTS
// Question:
// Count even and odd elements in a 2D array.
 

class Q17_EvenOdd {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int even = 0;
        int odd = 0;

        for (int[] row : arr) {

            for (int value : row) {

                if (value % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}


 
// 18. SUM OF EACH ROW AND FIND MAXIMUM ROW SUM
// Question:
// Find which row has the maximum sum.
 

class Q18_MaxRowSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {10, 20, 30},
            {4, 5, 6}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }

            if (sum > maxSum) {

                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row = " + maxRow);
        System.out.println("Maximum sum = " + maxSum);
    }
}


 
// 19. JAGGED ARRAY
// Question:
// Create and print a jagged array where every row has
// a different number of elements.
 

class Q19_JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5};
        arr[2] = new int[]{6, 7, 8, 9};

        for (int[] row : arr) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}


 
// 20. SPIRAL MATRIX
// Question:
// Print a matrix in spiral order.
 

class Q20_SpiralMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int top = 0;
        int bottom = a.length - 1;
        int left = 0;
        int right = a[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left to right
            for (int j = left; j <= right; j++)
                System.out.print(a[top][j] + " ");

            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");

            right--;

            // Right to left
            if (top <= bottom) {

                for (int j = right; j >= left; j--)
                    System.out.print(a[bottom][j] + " ");

                bottom--;
            }

            // Bottom to top
            if (left <= right) {

                for (int i = bottom; i >= top; i--)
                    System.out.print(a[i][left] + " ");

                left++;
            }
        }
    }
}


 
// 21. ROTATE MATRIX 90 DEGREES
// Question:
// Rotate a square matrix 90 degrees clockwise.
 

class Q21_RotateMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;

        // Transpose
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }

        for (int[] row : a) {

            System.out.println(Arrays.toString(row));
        }
    }
}


 
// 22. CHECK IDENTITY MATRIX
// Question:
// Check whether a square matrix is an identity matrix.
 

class Q22_IdentityMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                if (i == j && a[i][j] != 1)
                    identity = false;

                if (i != j && a[i][j] != 0)
                    identity = false;
            }
        }

        System.out.println(identity);
    }
}


 
// 23. FIND SUM OF BOUNDARY ELEMENTS
// Question:
// Find the sum of all boundary elements of a matrix.
 

class Q23_BoundarySum {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = 0;

        int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (i == 0 ||
                    i == rows - 1 ||
                    j == 0 ||
                    j == cols - 1) {

                    sum += a[i][j];
                }
            }
        }

        System.out.println("Boundary sum = " + sum);
    }
}


 
// 24. COUNT OCCURRENCE OF AN ELEMENT
// Question:
// Count how many times a target occurs in a 2D array.
 

class Q24_CountElement {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 2},
            {3, 2, 4},
            {2, 5, 2}
        };

        int target = 2;
        int count = 0;

        for (int[] row : a) {

            for (int value : row) {

                if (value == target)
                    count++;
            }
        }

        System.out.println("Count = " + count);
    }
}


 
// 25. DEEP COPY OF 2D ARRAY
// Question:
// Create an independent copy of a 2D array.
 

class Q25_DeepCopy {
    public static void main(String[] args) {

        int[][] original = {
            {1, 2},
            {3, 4}
        };

        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {

            copy[i] = original[i].clone();
        }

        copy[0][0] = 100;

        System.out.println("Original: " + original[0][0]);
        System.out.println("Copy: " + copy[0][0]);
    }
}


 
// 26. PACKAGE EXAMPLE
// Question:
// Create a class inside a custom package and access it
// from another class.
//
// File 1: Student.java
//
// package college;
// public class Student {
//     public void display() {
//         System.out.println("Student class");
//     }
// }
//
// File 2: Main.java
//
// import college.Student;
 

// Student.java
//
// package college;
//
// public class Student {
//
//     public void display() {
//         System.out.println("Student class");
//     }
// }


// Main.java
//
// import college.Student;
//
// public class Main {
//
//     public static void main(String[] args) {
//
//         Student s = new Student();
//
//         s.display();
//     }
// }


 
// 27. PRIVATE ACCESS MODIFIER
// Question:
// Demonstrate that private data can only be accessed through
// methods of the same class.
 

class Q27_PrivateAccess {

    private int balance = 1000;

    void displayBalance() {

        System.out.println(balance);
    }

    public static void main(String[] args) {

        Q27_PrivateAccess obj = new Q27_PrivateAccess();

        obj.displayBalance();

        // obj.balance = 5000;
        // This would cause a compilation error because
        // balance is private.
    }
}


 
// 28. DEFAULT ACCESS MODIFIER
// Question:
// Demonstrate package-private/default access.
//
// Members with no explicit modifier can be accessed
// by classes in the same package.
 

class Q28_DefaultAccess {

    int number = 100;

    void display() {

        System.out.println(number);
    }

    public static void main(String[] args) {

        Q28_DefaultAccess obj = new Q28_DefaultAccess();

        obj.number = 200;

        obj.display();
    }
}


 
// 29. PROTECTED ACCESS MODIFIER
// Question:
// Demonstrate protected member access through inheritance.
 

class Q29_ProtectedAccess {

    protected int value = 50;
}


// Subclass can access protected member
class Q29_Child extends Q29_ProtectedAccess {

    void display() {

        System.out.println(value);
    }

    public static void main(String[] args) {

        Q29_Child obj = new Q29_Child();

        obj.display();
    }
}


 
// 30. PUBLIC ACCESS MODIFIER
// Question:
// Demonstrate public member access.
 

class Q30_PublicAccess {

    public int value = 100;

    public void display() {

        System.out.println(value);
    }

    public static void main(String[] args) {

        Q30_PublicAccess obj = new Q30_PublicAccess();

        obj.value = 500;

        obj.display();
    }
}


 
// 31. ENCAPSULATION USING PRIVATE VARIABLES
// Question:
// Create private variables and access them using
// public getter and setter methods.
 

class Q31_Encapsulation {

    private int age;

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {

        Q31_Encapsulation obj = new Q31_Encapsulation();

        obj.setAge(20);

        System.out.println(obj.getAge());
    }
}


 
// 32. ACCESS MODIFIER COMBINATION
// Question:
// Demonstrate all four access levels inside a class.
 

class Q32_AllAccessModifiers {

    private int privateValue = 10;

    int defaultValue = 20;

    protected int protectedValue = 30;

    public int publicValue = 40;

    void display() {

        System.out.println(privateValue);
        System.out.println(defaultValue);
        System.out.println(protectedValue);
        System.out.println(publicValue);
    }

    public static void main(String[] args) {

        Q32_AllAccessModifiers obj =
            new Q32_AllAccessModifiers();

        obj.display();
    }
}


 
// 33. ACCESSING PUBLIC MEMBER FROM ANOTHER CLASS
// Question:
// Access a public variable from another class.
 

class Q33_PublicClass {

    public int number = 100;
}


class Q33_Main {

    public static void main(String[] args) {

        Q33_PublicClass obj = new Q33_PublicClass();

        System.out.println(obj.number);
    }
}


 
// 34. PROTECTED MEMBER THROUGH SUBCLASS
// Question:
// Access a protected member through inheritance.
 

class Q34_Parent {

    protected int x = 10;
}


class Q34_Child extends Q34_Parent {

    public static void main(String[] args) {

        Q34_Child obj = new Q34_Child();

        System.out.println(obj.x);
    }
}


 
// 35. PRIVATE MEMBER THROUGH METHOD
// Question:
// Access a private variable using a public method.
 

class Q35_PrivateThroughMethod {

    private int x = 100;

    public int getX() {

        return x;
    }

    public static void main(String[] args) {

        Q35_PrivateThroughMethod obj =
            new Q35_PrivateThroughMethod();

        System.out.println(obj.getX());
    }
}


 
// 36. PACKAGE + ACCESS MODIFIER EXAMPLE
// Question:
// Create a package with a public class and access it from
// another package.
//
// File: p1/Student.java
//
// package p1;
//
// public class Student {
//
//     public void display() {
//         System.out.println("Hello Student");
//     }
// }
//
// File: p2/Main.java
//
// package p2;
//
// import p1.Student;
//
// public class Main {
//
//     public static void main(String[] args) {
//
//         Student s = new Student();
//
//         s.display();
//     }
// }
 


 
// 37. FIND MAXIMUM ELEMENT IN EACH ROW
// Question:
// Find the maximum element of every row.
 

class Q37_MaxEachRow {
    public static void main(String[] args) {

        int[][] a = {
            {1, 8, 3},
            {9, 2, 5},
            {4, 7, 6}
        };

        for (int i = 0; i < a.length; i++) {

            int max = a[i][0];

            for (int j = 1; j < a[i].length; j++) {

                if (a[i][j] > max)
                    max = a[i][j];
            }

            System.out.println(
                "Maximum of row " + i + " = " + max
            );
        }
    }
}


 
// 38. FIND MINIMUM ELEMENT IN EACH COLUMN
// Question:
// Find the minimum element in every column.
 

class Q38_MinEachColumn {
    public static void main(String[] args) {

        int[][] a = {
            {8, 2, 7},
            {3, 9, 4},
            {6, 1, 5}
        };

        int columns = a[0].length;

        for (int j = 0; j < columns; j++) {

            int min = a[0][j];

            for (int i = 1; i < a.length; i++) {

                if (a[i][j] < min)
                    min = a[i][j];
            }

            System.out.println(
                "Minimum of column " + j + " = " + min
            );
        }
    }
}


 
// 39. CHECK SPARSE MATRIX
// Question:
// Check whether the number of zero elements is greater
// than the number of non-zero elements.
 

class Q39_SparseMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {0, 0, 3},
            {0, 0, 0},
            {4, 0, 0}
        };

        int zero = 0;
        int nonZero = 0;

        for (int[] row : a) {

            for (int value : row) {

                if (value == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not Sparse Matrix");
    }
}


 
// 40. SORT EACH ROW
// Question:
// Sort every row of a 2D array independently.
 

class Q40_SortEachRow {
    public static void main(String[] args) {

        int[][] a = {
            {5, 2, 8},
            {9, 1, 3},
            {7, 6, 4}
        };

        for (int i = 0; i < a.length; i++) {

            Arrays.sort(a[i]);
        }

        for (int[] row : a) {

            System.out.println(Arrays.toString(row));
        }
    }
}