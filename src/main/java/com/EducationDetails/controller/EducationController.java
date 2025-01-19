package com.EducationDetails.controller;

import com.EducationDetails.entity.EducationDetails;
import com.EducationDetails.service.EducationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/education")
public class EducationController {

   private EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }
    @GetMapping("/details")
    public EducationDetails  getEducationDetails() {
        return educationService.getEducationDetails();
    }
}