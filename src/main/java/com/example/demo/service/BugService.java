package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BugRepository;
import com.example.demo.entity.Bug;

@Service
public class BugService {

	@Autowired
	BugRepository bugRepository;

	public void saveUser(@Valid Bug bug) {
		bugRepository.save(bug);

	}

	public Iterable<Bug> getBugs() {
		return bugRepository.findAll();
	}

}