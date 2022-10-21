package com.example.LeHoangLong_19439111.service;

import java.util.List;

import com.example.LeHoangLong_19439111.entity.Subject;


public interface SubjectService {
	List<Subject> getDS();
	void save(Subject subject);
}
