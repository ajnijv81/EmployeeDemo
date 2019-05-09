package com.galvanize.employeedb.Entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name="JOB")
@Data
public class Job {
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long jobId;

        @Column(name="EMP_ID")
        private Long empId;


        @Column(name="CUSTOMER")
        private String customer;

        @Column(name="STARTDATE")
        private Date startDate;

        @Column(name="ENDDATE")
        private Date endDate;



}
