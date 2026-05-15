package lec02;

// Debugger demo
public class CourseChecker {
    public static void main(String[] args) {
        int course = 210;
        String[] students = {"Amit", "Yuqi", "Brian"};

        if (check(course)) {
            process(course);
        } else {
            System.out.println("Oh...");
        }

        course = 301;
    }

    public static boolean check(int course) {
        return course == 210;
    }

    public static void process(int course) {
       if (Math.max(course, 101) % 2 == 0) {
           System.out.println("Yippee!");
       }
    }
}
