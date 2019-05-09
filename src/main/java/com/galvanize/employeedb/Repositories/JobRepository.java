package com.galvanize.employeedb.Repositories;

import com.galvanize.employeedb.Entities.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {

   //ArrayList<Job> employeeJobHistoryByEmpID(Long empId);

}
