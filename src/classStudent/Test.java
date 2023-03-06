package classStudent;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hoa");
        student1.setClasses("Java10");
        student1.display();
        Student student2 = new Student();
        student2.display();
        student2.setName("hello");
        student2.display();
    }
}
