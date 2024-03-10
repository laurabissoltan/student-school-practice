package kz.laurabissoltan.studentpracticeproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "school")
public class School {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @Column (name = "school_name")
    String name;

    @Column (name = "student_count")
    int studentCount;

}
