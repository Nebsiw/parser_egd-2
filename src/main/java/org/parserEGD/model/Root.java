package org.parserEGD.model;

import java.util.List;

public class Root {
    //private String name;

    private List<Users> staff;


   /* public String getName() {
        return name;
    }*/

    public List<Users> getStaff() {
        return staff;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public void setStaff(List<Users> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return staff.toString();
    }
}
