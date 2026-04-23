package com.n11bootcamp.springbootornek.controller;

import java.util.List;

import com.n11bootcamp.springbootornek.entity.Project;
import com.n11bootcamp.springbootornek.service.impl.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProjectController {


    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl) {
        this.projectServiceImpl = projectServiceImpl;
    }


    @GetMapping(value = "/allprojects")

    public List<Project> getAllProjects() {
        List<Project> liste =projectServiceImpl.getAll();
        return liste;
    }

    @PostMapping
    public ResponseEntity<Project> createProduct(@RequestBody Project product) {
        return ResponseEntity.ok(projectServiceImpl.save(product));
    }

    // 3. Id'ye göre proje getir
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProductById(@PathVariable("id") Long productId) {
        return ResponseEntity.ok(projectServiceImpl.getById(productId));
    }

}
