package org.example.util;
import org.example.dto.EmployeeDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Component
public class StorageUtil {
    public static Map<Integer, EmployeeDTO> employeeMap= new HashMap<>();

    public static EmployeeDTO getEmployee(int id){
        EmployeeDTO employee = employeeMap.get(id);
        return employeeMap.get(id);
    }

    public static void addEmployee(EmployeeDTO employeeDTO){
        employeeMap.put(employeeDTO.getId(), employeeDTO);
    }

    public static EmployeeDTO updateEmployeeByName(String name){
        EmployeeDTO employee= employeeMap.get(name);
                employee.setName(name);
                employee.getName();
        return employeeMap.get(name);


    }


    public static void deleteEmployeeById(int id) {
        employeeMap.remove(id);

    }
}
