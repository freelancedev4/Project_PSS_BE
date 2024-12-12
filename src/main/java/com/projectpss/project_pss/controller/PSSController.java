package com.projectpss.project_pss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PSSController {

    @GetMapping("/firstRequest")
    public String getFirstEndPoint() {
        return "You just hit your first end point.";
    }
}
