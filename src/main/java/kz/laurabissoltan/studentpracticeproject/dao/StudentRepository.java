package kz.laurabissoltan.studentpracticeproject.dao;

import kz.laurabissoltan.studentpracticeproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByFirstName(String firstName);
    List<Student> getStudentsByAge(int age);
}
