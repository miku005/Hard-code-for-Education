package com.EducationDetails.service;

import com.EducationDetails.entity.EducationDetails;
import org.springframework.stereotype.Service;

@Service
public class EducationService {


    public EducationDetails getEducationDetails() {
        return new EducationDetails(
                "Bhagyajeet Pattnayak",
                "Bachelor in Commerce",
                "Dharanidhar University",
                2024

        );

    }

}