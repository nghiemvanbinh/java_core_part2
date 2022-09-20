package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public boolean permanent;
    public Address address;
    public ArrayList<Integer> phoneNumbers;
    public String role;
    public ArrayList<String> cities;
    public Properties properties;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                ", properties=" + properties +
                '}';
    }
}
