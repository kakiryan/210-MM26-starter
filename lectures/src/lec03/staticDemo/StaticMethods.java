package lec03.staticDemo;

public class StaticMethods {
    public static void main(String[] args){

        // which statement will work?
//         ClassB.staticMethod();
//         ClassB.nonStaticMethod();
    }
}

class ClassB {
    static void staticMethod() {
        System.out.println("This is a Static Method");
    }
    void nonStaticMethod() {
        System.out.println("This is a NON-Static Method");
    }
}
