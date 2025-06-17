package com.Anmol.mongo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
    @Id
    private long id;
    private String name;
    private String designation;
    private int salary;
    public User (){}

    public User (long id, String name, String designation, int salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void setId(long id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setDesignation(String designation){
        this.designation = designation;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    long getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getDesignation(){
        return designation;
    }
    int getSalary(){
        return salary;
    }
}
