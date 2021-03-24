package org.example.controller;


import org.example.dto.Emp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class EmpController {

    @GetMapping(value = "/v1/test", produces = APPLICATION_JSON_VALUE)
    public Map<Integer, Emp.DATA> test() {
        /*int a=10;int b=20;int c=a+b;*/
        /*System.out.println("Tanya");
        //return 20;
        HashMap<Integer, String> map = new HashMap<>(10);
        // Add Elements using put method
        map.put(7051, "Tanya");
        map.put(7052, "Manya");
        map.put(7053, "Sanya");
        map.get(7052);
        return map;*/
        int id_list[] = {7051, 7052, 7053, 7054};
        String name_list[] = {"Tanya", "Amit", "Amisha", "Manish"};
        String address_list[] = {"Ranchi", "Bangalore", "Patna", "Kolkata"};
        Emp e1 = new Emp();
        e1.addValues(id_list, name_list, address_list);
        Map<Integer, Emp.DATA> multimap = new HashMap<>();
        multimap.put(1, e1.list1.get(0));
        multimap.put(2, e1.list1.get(1));
        multimap.put(3, e1.list1.get(2));
        multimap.put(4, e1.list1.get(3));
        return multimap;
    }}

