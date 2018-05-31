package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Internship(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getStudents() {
        String result = "";
        for (Student student: students){
            result += student.getName()+"\n";
        }
        return result;
    }
}
