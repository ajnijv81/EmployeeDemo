package com.galvanize.employeedb.Repositories;

import com.galvanize.employeedb.Entities.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {

}
