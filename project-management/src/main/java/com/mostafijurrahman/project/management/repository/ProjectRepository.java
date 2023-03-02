package com.mostafijurrahman.project.management.repository;

import com.mostafijurrahman.project.management.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Integer> {

    List<Project> findAll();

}
