package org.example;
//this file invokes the controller which is responsible for displaying the output on local machine
import org.example.dto.EmployeeDTO;
import org.example.util.StorageUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        StorageUtil.addEmployee(new EmployeeDTO(1, "Tanya", "India"));
        StorageUtil.addEmployee(new EmployeeDTO(2, "Ryan", "France"));
        StorageUtil.addEmployee(new EmployeeDTO(3, "Tanisha", "Russia"));
        StorageUtil.addEmployee(new EmployeeDTO(4, "Ron", "India"));
        SpringApplication.run(TestApplication.class,args);
    }
}
