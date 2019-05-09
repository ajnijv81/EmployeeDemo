package com.galvanize.employeedb.Controllers;

import com.galvanize.employeedb.Entities.Job;
import com.galvanize.employeedb.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService service;

    public JobController(JobService service ){
        this.service = service;
    }

    @RequestMapping(value="/job", method= RequestMethod.POST)
    public ResponseEntity<?> addJob(@RequestBody Job job,
                                         Model model, BindingResult result ){
        ModelMap modelmap = new ModelMap();

        this.service.addJob(job);
        modelmap.put("message", "Saved");
        ResponseEntity<?> out = new ResponseEntity<>(modelmap, HttpStatus.OK);
        return out;
    }
}
