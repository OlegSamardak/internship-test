package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Internship(String name) {
        this.name = name;
    }

    public void addStudent(Student student, University university) {
        if (university.getAverageKnowledge() < student.getKnowledge())
            students.add(student);
        else
            System.out.println("Нажаль, студент " + student.getName() + " має недостатній рівень знань.");
    }

    public String getStudents() {
        String result = "";
        for (Student student: students){
            result += student.getName()+"\n";
        }
        return result;
    }
}
