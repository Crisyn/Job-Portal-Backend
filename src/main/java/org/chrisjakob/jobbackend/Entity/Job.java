package org.chrisjakob.jobbackend.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_db")
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @Column(name = "id")
    @GeneratedValue
    public int id;

    @Column(name = "jobName")
    public String jobName;

    @Column(name = "jobShortDescription")
    public String jobShortDescription;

    @Column(name = "jobLocation")
    public String jobLocation;

    @Column(name = "emplymentType")
    public String emplymentType;

    @Column(name = "favorited")
    public boolean favorited;
}
