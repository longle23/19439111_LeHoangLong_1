package com.example.LeHoangLong_19439111.service;

import java.util.List;

import com.example.LeHoangLong_19439111.entity.Subject;


public interface SubjectService {
	Subject getById(String id);
	List<Subject> getDS();
	void saveSubject(Subject subject);
}
