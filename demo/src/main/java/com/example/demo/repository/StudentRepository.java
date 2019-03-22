package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select student from Student  student")
    List<Student> getAllStudents();
    @Query(value = "insert into student (name,login,password,course,university) values ('vanya','cat','123',0,'BSUIR'); ", nativeQuery = true)
    @Transactional
    void insertStudent();
}

