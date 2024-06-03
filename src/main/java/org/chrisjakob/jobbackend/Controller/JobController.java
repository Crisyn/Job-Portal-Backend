package org.chrisjakob.jobbackend.Controller;
import org.chrisjakob.jobbackend.Entity.Job;
import org.chrisjakob.jobbackend.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/addJob")
    public Job addJob(@RequestBody Job job) {
        return jobService.saveJob(job)
;
    }

    @GetMapping("/job/{id}")
    public Job getJobs(@PathVariable(value = "id" ) int id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/{search}")
    public List<Job> getJobs(@PathVariable(value = "search" ) String search) {
        return jobService.jobRepo.findByJobNameContains(search);
    }

    @DeleteMapping("/delJob/{id}")
    public void deleteJob(@PathVariable(value = "id" ) int id) {
        jobService.deleteJobById(id);
    }
}