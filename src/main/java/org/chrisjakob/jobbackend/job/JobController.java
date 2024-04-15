package org.chrisjakob.jobbackend.job;

import jakarta.servlet.http.HttpServletRequest;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class JobController {
    @Autowired
    public JdbcTemplate db;

    @GetMapping("/job")
    public Job getJob(@RequestParam(value = "id", required = false) Integer id) throws ExecutionControl.NotImplementedException {
        if (id == null) {
            return db.queryForObject("SELECT * FROM jobInfo", new Job.JobMapper());
        }

        return db.queryForObject("SELECT * FROM jobInfo WHERE id = ?", new Job.JobMapper(), id);
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() throws ExecutionControl.NotImplementedException {
        return db.query("SELECT * FROM jobInfo", new Job.JobMapper());
    }

    @PostMapping("/job")
    public Map<String, String[]> postJob(HttpServletRequest request) {
        return request.getParameterMap();
    }

}
