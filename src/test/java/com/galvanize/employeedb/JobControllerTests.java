package com.galvanize.employeedb;

import com.galvanize.employeedb.Controllers.JobController;
import com.galvanize.employeedb.Entities.Employee;
import com.galvanize.employeedb.Entities.Job;
import com.galvanize.employeedb.Repositories.JobRepository;
import com.galvanize.employeedb.Services.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobControllerTests {

    @Mock
    private JobRepository jobRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testAddJob() throws ParseException {

        SimpleDateFormat sDate = new SimpleDateFormat("MM/dd/yyyy");
        Job job = new Job();
        job.setEmpId(2L);
        job.setCustomer("TestNm");
        job.setEndDate(sDate.parse("2018/02-/22"));
        job.setStartDate(sDate.parse("2017-02-02"));

        //Setup
        given(jobRepository.save( job )).willReturn( job );
        JobService es = new JobService(jobRepository);
        JobController jc = new JobController(es);

        //Execute
        Job jobactual = jobRepository.save(job);


        //Assert
        then(jobRepository).should(times(1)).save(job);


        //Teardown
    }
}
