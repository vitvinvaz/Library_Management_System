import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Book> list = new ArrayList<>();

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
