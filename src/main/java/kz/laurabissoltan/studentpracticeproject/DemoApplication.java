package kz.laurabissoltan.studentpracticeproject;

import kz.laurabissoltan.studentpracticeproject.dao.SchoolRepository;
import kz.laurabissoltan.studentpracticeproject.dao.StudentRepository;
import kz.laurabissoltan.studentpracticeproject.model.School;
import kz.laurabissoltan.studentpracticeproject.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        School school = new School(1L, "RRR", 122);
        School school2 = new School(2L, "NIS", 500);
        School school3 = new School(3L, "KTL", 500);
        List<School> schoolList = new ArrayList<>();
        schoolList.add(school);
        schoolList.add(school2);
        schoolList.add(school3);
        schoolRepository.saveAll(schoolList);

        Student student = new Student(1L, "Laura", "B", "laura@gmail.com", 26, 100);
        Student student2 = new Student(2L, "Laura2", "B", "laura@gmail.com", 26, 100);
        Student student3 = new Student(3L, "Laura3", "B", "laura@gmail.com", 26, 100);

        studentRepository.save(student);
        studentRepository.save(student2);
        studentRepository.save(student3);

        List<Student> studentList = studentRepository.findStudentByFirstName("Laura");
        System.out.println("First method find students by name");
        for(Student students: studentList) {
            System.out.println(students);
        }
      //  System.out.println("First method find students by name" + studentList.toString());

        List<Student> studentByAge = studentRepository.getStudentsByAge(26);
        System.out.println("Second method finding by age");
        for(Student students: studentByAge) {
            System.out.println(students);
        }
      //  System.out.println("Second method finding by age" + studentByAge.toString());

        School school4 = schoolRepository.findSchoolByName("NIS");
        System.out.println("Third method find school by name" + school4.toString());

        int numberOfStudents = schoolRepository.totalStudents(2);
        System.out.println("Fourth method get the number of students by school id " + numberOfStudents);


    }
}
