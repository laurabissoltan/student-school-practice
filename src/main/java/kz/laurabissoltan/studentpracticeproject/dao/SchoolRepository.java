package kz.laurabissoltan.studentpracticeproject.dao;

import kz.laurabissoltan.studentpracticeproject.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findSchoolByName(String schoolName);


    @Query("select s.studentCount from School s where s.id = :id")
    int totalStudents(long id);
}
