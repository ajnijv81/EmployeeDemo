package com.galvanize.employeedb.Entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name="JOB")
@Data
public class Job {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "JOB_ID", unique = true, nullable = false)
        private Long JobID;
        @Column(name="EMP_ID")
        private Long EmpID;


    @Column(name="CUSTOMER")
        private String Customer;

        @Column(name="STARTDATE")
        private Date StartDate;

        @Column(name="ENDDATE")
        private Date EndDate;


    public Long getJobID() {
        return JobID;
    }

    public void setJobID(Long jobID) {
        JobID = jobID;
    }

    public Long getEmpID() {
        return EmpID;
    }

    public void setEmpID(Long empID) {
        EmpID = empID;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

}
