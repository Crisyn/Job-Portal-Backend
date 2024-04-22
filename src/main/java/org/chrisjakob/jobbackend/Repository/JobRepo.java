package org.chrisjakob.jobbackend.Repository;

import org.chrisjakob.jobbackend.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Integer> {
}
