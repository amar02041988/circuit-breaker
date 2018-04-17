package com.amar.cb.ofac.client.model;


public class CustomerBo implements Customer {

    private String name;
    private String dob;


    public CustomerBo(String name, String dob) {
        super();
        this.name = name;
        this.dob = dob;
    }


    public String getName() {
        return name;
    }


    public String getDob() {
        return dob;
    }


    @Override
    public String toString() {
        return "Customer [name=" + name + ", dob=" + dob + "]";
    }
}
