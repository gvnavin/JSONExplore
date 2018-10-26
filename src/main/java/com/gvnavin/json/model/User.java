package com.gvnavin.json.model;

//http://javarevisited.blogspot.com/2013/02/how-to-convert-json-string-to-java-object-jackson-example-tutorial.html#ixzz4sqzuFIk8
public class User {
    private String name;
    private String surname;
    private long phone;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public long getPhone() {
        return phone;
    }
    
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "User [name=" + name + ", surname=" + surname + ", phone=" + phone + "]";
    }
}