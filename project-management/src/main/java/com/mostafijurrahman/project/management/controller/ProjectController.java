package com.mostafijurrahman.project.management.controller;


import com.mostafijurrahman.project.management.model.Project;
import com.mostafijurrahman.project.management.repository.ProjectRepository;
import com.mostafijurrahman.project.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    private ProjectRepository projectRepository;

    @GetMapping("/project")
    public String projectForm(Model model) {
        model.addAttribute("project", new Project());
        return "project";
    }

    @PostMapping("/project")
    public String projectSubmit(@ModelAttribute Project project, Model model) {

        projectService.Project(project);

//        return "project";
        return "redirect:/projectInventory";
    }


    @GetMapping("/projectInventory")
    public String showAllProjects(Model model) {
        List<Project> allProjects = projectService.getAllProjects();
        model.addAttribute("allProjects", allProjects);

        System.out.println(allProjects);
        return "/projectInventory";

        //creating a get mapping that retrieves the detail of a specific project
    }
//    @GetMapping("/Project/{projectid}")
//    private Project getProject(@PathVariable("projectid") int projectid)
//    {
//        return ProjectService.getprojectid (projectid);
//    }
//
//    //creating a delete mapping that deletes a specified project
//    private void deleteProject(@PathVariable("projectid") int projectid)
//    {
//        ProjectService.delete(projectid);
//    }
//
//    //creating post mapping that post the project detail in the database
//    @PostMapping("/project")
//    private int saveProject(@RequestBody Project project)
//    {
//        ProjectService.saveOrUpdate(project);
//        return project.getid();
//    }
//
//    //creating put mapping that updates the project detail
//    @PutMapping("/project")
//    private Project update(@RequestBody Project project)
//    {
//        ProjectService.saveOrUpdate(project);
//        return project;
//    }
}












