package com.bc.spring_with_react.repository;

import com.bc.spring_with_react.domain.StudentID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentIdRepository extends JpaRepository<StudentID, Integer> {


}
