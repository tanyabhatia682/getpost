package org.example.dto;

public class EmployeeDTO {
    private int id;
    private String name;
    private String address;

    public EmployeeDTO(int id, String n, String addr){
        this.id=id;
        this.name=n;
        this.address=addr;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String put() {return name;}
}
