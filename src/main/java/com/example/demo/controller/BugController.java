package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bug;
import com.example.demo.service.BugService;

@RestController
public class BugController {
	@Autowired
	BugService bugService;

	@GetMapping("/bug")
	Iterable<Bug> getBugs() {
		return bugService.getBugs();

	}

	@PostMapping("/bug") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createBug(@RequestBody @Valid Bug bug) {
		bugService.saveUser(bug);
	}
}