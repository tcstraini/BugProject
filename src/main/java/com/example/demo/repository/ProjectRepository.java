package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Integer> {

}