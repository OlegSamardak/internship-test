package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    List<Student> students = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getAverageKnowledge(){
        int knowledgeSum = 0;
        for (Student student: students){
            knowledgeSum += student.getKnowledge();
        }
        return (double) (knowledgeSum/students.size());
    }
}
