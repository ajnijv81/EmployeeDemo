package com.galvanize.employeedb.Services;

import com.galvanize.employeedb.Entities.Job;
import com.galvanize.employeedb.Repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository repository;
    @Autowired
    public JobService( JobRepository repository){
        this.repository = repository;
    }

    public void addJob( Job job){
        repository.save(job);
    }

    public ArrayList<Job> getJobHistoryByEmployeeId(Long empId) {
        return repository.employeeJobHistoryByEmpID(empId);
    }

}
