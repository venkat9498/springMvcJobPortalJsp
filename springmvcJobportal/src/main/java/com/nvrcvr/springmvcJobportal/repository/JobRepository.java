package com.nvrcvr.springmvcJobportal.repository;

import com.nvrcvr.springmvcJobportal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(new JobPost(1, "java developer", "desc1", 2, List.of("java", "oracle")),
            new JobPost(2, "java developer2", "desc1", 2, List.of("mongodb", "java")),
            new JobPost(3, "java develope3", "desc1", 2, List.of("java", "sql"))
    ));



    public List<JobPost> getAllJobs(){
        return jobPosts;
    }
    public void addJob(JobPost jobPost){
        jobPosts.add(jobPost);
        System.out.println(jobPosts);
    }

}
