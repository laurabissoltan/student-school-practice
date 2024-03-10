package kz.laurabissoltan.studentpracticeproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    long id;
    String firstName;
    String lastName;
    String email;
    int age;
    int grade;


}
