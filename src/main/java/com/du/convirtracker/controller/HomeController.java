package com.du.convirtracker.controller;

import com.du.convirtracker.models.LocationStats;
import com.du.convirtracker.service.ConvirDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ConvirDataService convirDataService;


    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStatus = convirDataService.getAllStats();
        int totalReportedCases = allStatus.stream().mapToInt(stat -> stat.getTotalUpdatedCases()).sum();
        model.addAttribute("locationStats", allStatus);
        model.addAttribute("totalReportedCases", totalReportedCases);
        return "home";
    }
}
