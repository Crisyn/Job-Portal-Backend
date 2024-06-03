package org.chrisjakob.jobbackend.Service;

import org.chrisjakob.jobbackend.Entity.Job;
import org.chrisjakob.jobbackend.Repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo jobRepo;

    public Job saveJob(Job job) {
        return jobRepo.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Job getJobById(int id) {
        return jobRepo.findById(id).get();
    }

    public void deleteJobById(int id) {
        jobRepo.deleteById(id);
    }

}
