package com.amar.cb.ofac.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDto {

    private String name;
    private String dob;

    public CustomerDto(@JsonProperty("name") String name, @JsonProperty("dob") String dob) {
        super();
        this.name = name;
        this.dob = dob;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDob(String dob) {
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
