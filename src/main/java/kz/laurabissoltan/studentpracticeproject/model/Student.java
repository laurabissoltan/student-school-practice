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
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int grade;


}
