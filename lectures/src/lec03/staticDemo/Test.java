package lec03.staticDemo;

class ClassA1 {
    static int _staticVar = 20;
    int _nonStaticVar = 30;
}
public class Test {
    public static void main(String[] args) {

        // Which of these statements will work?

        System.out.println(ClassA1._staticVar);

        ClassA1 x1 = new ClassA1();
        x1._nonStaticVar = 130;
        ClassA1._staticVar = 120;
        System.out.println(x1._nonStaticVar);
        System.out.println(ClassA1._staticVar);

        ClassA1 x2 = new ClassA1();
        x2._nonStaticVar = 230;
        ClassA1._staticVar = 220;

        System.out.println(x1._nonStaticVar);
        System.out.println(ClassA1._staticVar);
        System.out.println(x2._nonStaticVar);
        System.out.println(ClassA1._staticVar);
    }
}