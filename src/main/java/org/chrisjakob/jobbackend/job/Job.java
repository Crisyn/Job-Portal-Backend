package org.chrisjakob.jobbackend.job;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Job {
    public int id;
    public String jobName;
    public String jobShortDescription;
    public String jobLocation;
    public String emplymentType;
    public boolean favorited;

    public Job(int id, String jobName, String jobShortDescription, String jobLocation, String emplymentType, boolean favorited) {
        this.id = id;
        this.jobName = jobName;
        this.jobShortDescription = jobShortDescription;
        this.jobLocation = jobLocation;
        this.emplymentType = emplymentType;
        this.favorited = favorited;
    }


    public static class JobMapper implements RowMapper<Job> {
        @Override
        public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Job(
                    rs.getInt("id"),
                    rs.getString("jobname"),
                    rs.getString("jobShortDescription"),
                    rs.getString("jobLocation"),
                    rs.getString("emplymentType"),
                    rs.getBoolean("favorited")
            );
        }
    }

}
