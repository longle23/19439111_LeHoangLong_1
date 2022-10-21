package com.example.LeHoangLong_19439111.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LeHoangLong_19439111.entity.Subject;


@Repository
public interface SubjectRespository extends JpaRepository<Subject, String> {

}
