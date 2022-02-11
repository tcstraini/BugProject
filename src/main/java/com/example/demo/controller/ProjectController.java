package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;

	@GetMapping("/project")
	Iterable<Project> getProjects() {
		return projectService.getProjects();

	}

	@PostMapping("/project") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createProject(@RequestBody @Valid Project project) {
		projectService.saveUser(project);
	}

}