package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        Student firstStudent = new Student("Andrew Kostenko", new Knowledge(8));
        Student secondStudent = new Student("Julia Veselkina", new Knowledge(10));
        Student thirdStudent = new Student("Maria Perechrest", new Knowledge(9));
        Student fourthStudent = new Student("Vitaliy Stepura", new Knowledge(15));
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);
        university.addStudent(fourthStudent);

        Internship internship = new Internship("Interlink");
        internship.addStudent(firstStudent, university);
        internship.addStudent(secondStudent, university);
        internship.addStudent(thirdStudent, university);
        internship.addStudent(fourthStudent, university);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
