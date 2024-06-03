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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "jobName")
    public String jobName;

    @Column(name = "jobDescription")
    public String jobDescription;

    @Column(name = "jobLocation")
    public String jobLocation;

    @Column(name = "employmentType")
    public String employmentType;

    @Column(name = "favorited")
    public boolean favorited;

    @Column(name = "eMail")
    public String eMail;
}
