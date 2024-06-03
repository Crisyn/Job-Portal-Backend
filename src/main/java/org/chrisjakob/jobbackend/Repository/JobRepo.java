package org.chrisjakob.jobbackend.Repository;

import org.chrisjakob.jobbackend.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobRepo extends JpaRepository<Job, Integer> {
    List<Job> findByJobNameContains(String jobName);
}
