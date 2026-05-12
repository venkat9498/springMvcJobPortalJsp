package com.nvrcvr.springmvcJobportal.controller;

import com.nvrcvr.springmvcJobportal.model.JobPost;
import com.nvrcvr.springmvcJobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;
    @GetMapping({"/","home"})
    public String home(){
        System.out.println("hey");
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }
    @GetMapping("/viewalljobs")
    public String viewAlljobs(Model m){
        List<JobPost> jobPosts= jobService.getAllJobs();
        m.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }
}
