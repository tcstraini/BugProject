package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProjectRepository;
import com.example.demo.entity.Project;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	public void saveUser(Project project) {

		projectRepository.save(project);
	}

	public Iterable<Project> getProjects() {

		return projectRepository.findAll();
	}

}