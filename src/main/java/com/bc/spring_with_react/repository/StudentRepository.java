package com.bc.spring_with_react.repository;

import com.bc.spring_with_react.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value="select s from Student s where s.id = :id")
    List<Student> findStudentById(@Param("id") Integer id);


    //Test Matt Rigby Commit
}
