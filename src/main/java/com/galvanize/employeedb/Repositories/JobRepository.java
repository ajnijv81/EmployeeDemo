package com.galvanize.employeedb.Repositories;

import com.galvanize.employeedb.Entities.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {

    @Query(nativeQuery=true, value="SELECT a.* FROM JOB a WHERE a.EMP_ID =:empId")
   ArrayList<Job> employeeJobHistoryByEmpID(Long empId);

}
