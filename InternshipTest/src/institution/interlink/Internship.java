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
        if (university.getStudents().contains(student)) {
            if (university.getAverageKnowledge() < student.getKnowledge())
                students.add(student);
            else
                System.out.println("Нажаль, студент " + student.getName() + " має недостатній рівень знань.");
        }
        else
            System.out.println("Студент не навчається в цьому ВУЗі");
    }

    public String getStudents() {
        String result = "";
        for (Student student: students){
            result += student.getName()+"\n";
        }
        return result;
    }
}
