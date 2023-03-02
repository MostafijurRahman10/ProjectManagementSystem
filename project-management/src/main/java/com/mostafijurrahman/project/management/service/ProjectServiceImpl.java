package com.mostafijurrahman.project.management.service;

import com.mostafijurrahman.project.management.model.Project;
import com.mostafijurrahman.project.management.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void Project(Project project) {

        projectRepository.save(project);

    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}

