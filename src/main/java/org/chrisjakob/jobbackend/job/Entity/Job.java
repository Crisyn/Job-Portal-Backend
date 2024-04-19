package org.chrisjakob.jobbackend.job.Entity;


import lombok.Data;


@Data

public class Job {
    public int id;
    public String jobName;
    public String jobShortDescription;
    public String jobLocation;
    public String emplymentType;
    public boolean favorited;

}
