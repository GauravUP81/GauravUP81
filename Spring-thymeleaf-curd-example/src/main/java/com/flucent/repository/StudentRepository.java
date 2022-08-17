package com.flucent.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flucent.bean.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
