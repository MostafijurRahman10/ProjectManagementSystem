package com.mostafijurrahman.project.management.service;


import com.mostafijurrahman.project.management.model.Project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    public void Project(Project project);

    List<Project> getAllProjects();

}


