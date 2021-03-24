package org.example.dto;

import java.util.ArrayList;

public class Emp
{
   /* private int id;
    private String name;
    private String address;


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
*/
   public ArrayList<DATA> list1 = new ArrayList<>();
    public class DATA {
        public String name;
        public int id;
        public String address;

        public DATA(String n, int id, String addr) {
            this.name = n;
            this.id = id;
            this.address = addr;
        }
    }
    public void addValues(int ID[],String Name[], String Adrr[])
    {

        for(int i=0; i<4; i++)
        {
            list1.add(new DATA(Name[i],ID[i],Adrr[i]));
        }
    }

}