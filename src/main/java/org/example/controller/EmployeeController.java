package org.example.controller;

import org.example.dto.EmployeeDTO;
import org.example.util.StorageUtil;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EmployeeController {


    //GetMethod
    @GetMapping(value="/api/v1/employees/{id}",produces = APPLICATION_JSON_VALUE)
    public EmployeeDTO getEmployee (@PathVariable Integer id){
        return StorageUtil.getEmployee(id);
    }

    @PostMapping(value = "/api/v1/employees", produces = APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){
        StorageUtil.addEmployee(employeeDTO);
    }

    @PutMapping(value="/api/v1/employees/{id}", produces =APPLICATION_JSON_VALUE)
    public EmployeeDTO updateEmployeeByName(@PathVariable String name){

        return StorageUtil.updateEmployeeByName(name);
    }

    @DeleteMapping(value="/api/v1/employees/{id}", produces = APPLICATION_JSON_VALUE)
    public void deleteEmployeeById(@PathVariable int id){
       StorageUtil.deleteEmployeeById(id);
    }

}

