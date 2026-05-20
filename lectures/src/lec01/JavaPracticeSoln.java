package lec01;

import java.util.Scanner;

public class JavaPracticeSoln {
    public static void main(String[] args) {
        // Create scanner and input variables
        Scanner s = new Scanner(System.in);
        int n, m;
        double a, b;
        String s1;

        // Get an integer n from the user
        System.out.println("Enter integer 'n':");
        n = s.nextInt();

        // Check value of n
        if (n == 1) {
            // Task 1: Print “Hello, World!”

            System.out.println("Hello, World!");
        } else if (n == 2) {
            // Task 2: Using Scanner and Printing numbers

            // Get 2 doubles a, b and an integer m from the user
            System.out.println("Enter double 'a':");
            a = s.nextDouble();
            System.out.println("Enter double 'b':");
            b = s.nextDouble();
            System.out.println("Enter integer 'm':");
            m = s.nextInt();

            // Print out a, b, and m
            System.out.println("a = " + a + ", b = "
                    + b + ", m = " + m);
        } else if (n == 3) {
            // Task 3: Writing a math function

            // Get 2 doubles a, b and an integer m from the user
            System.out.println("Enter double 'a':");
            a = s.nextDouble();
            System.out.println("Enter double 'b':");
            b = s.nextDouble();
            System.out.println("Enter integer 'm':");
            m = s.nextInt();

            // Call quadFun on a, b, and m and print the output
            System.out.println(quadFun(a, b, m));
        } else if (n == 4) {
            // Task 4: Writing a function on strings

            // Get a string s1 from the user
            System.out.println("Enter a string:");
            s1 = s.next();

            // Call stringFun1 on s1 and print the output
            System.out.println(stringFun1(s1));
        } else if (n == 5) {
            // Task 5: Writing a function to concatenate substrings

            // Get a string s1 and 4 integers i1, i2, i3, and i4 from the user
            System.out.println("Enter a string:");
            s1 = s.next();
            System.out.println("Enter integer i1:");
            int i1 = s.nextInt();
            System.out.println("Enter integer i2:");
            int i2 = s.nextInt();
            System.out.println("Enter integer i3:");
            int i3 = s.nextInt();
            System.out.println("Enter integer i4:");
            int i4 = s.nextInt();

            // Call stringFun2 on s1, i1, i2, i3, i4 and print the output
            System.out.println(stringFun2(s1, i1, i2, i3, i4));
        } else if (n == 6) {
            // Task 6: Using Arrays

            // Get an integer m from the user
            System.out.println("Enter integer m:");
            m = s.nextInt();

            // Create a double array of size m
            double[] arr = new double[m];
            // Keeps track of total sum
            double sum = 0.0;

            // Get m doubles from the user
            System.out.println("Enter m doubles:");
            for (int i = 0; i < m; i++) {
                // Save the double in arr
                arr[i] = s.nextDouble();
                // Add the double to sum
                sum += arr[i];
            }

            // Print the average to 2 decimal places
            System.out.printf("Average = %.2f%n", sum / m);

            // Print arr contents in reverse order
            for (int i = m-1; i >= 0; i--) {
                System.out.println("arr[" + i + "]=" + arr[i]);
            }
        }
    }

    public static double quadFun(double a, double b, int m) {
        return (a * m * m + b);
    }

    public static int stringFun1(String st) {
        return (st.length());
    }
    public static String stringFun2(String st, int i1, int i2, int i3, int i4) {
        // Substring of st from indexes i1 to i2
        String sA = st.substring(i1, i2);
        // Substring of st from indexes i3 to i4
        String sB = st.substring(i3, i4);

        // Concatenate sA and SB
        return (sA.concat(sB));
    }
}
