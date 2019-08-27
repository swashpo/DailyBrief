import java.util.Stack;

public class Class {

    private Stack<Student> students;
    private int size;

    public Class() {
        size = 0;
    }

    public void addStudent(Student student) {
        students.push(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void display() {

    }

    public int size() {
        return size;
    }
}
