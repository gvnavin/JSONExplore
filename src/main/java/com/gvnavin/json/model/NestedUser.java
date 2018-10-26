package com.gvnavin.json.model;

//http://javarevisited.blogspot.com/2013/02/how-to-convert-json-string-to-java-object-jackson-example-tutorial.html#ixzz4sqzuFIk8
public class NestedUser {
    
    private String nestedName;
    private String nestedSurname;
    private long nestedPhone;
    
    public String getNestedName() {
        return nestedName;
    }
    
    public void setNestedName(String nestedName) {
        this.nestedName = nestedName;
    }
    
    public String getNestedSurname() {
        return nestedSurname;
    }
    
    public void setNestedSurname(String surname) {
        this.nestedSurname = nestedSurname;
    }
    
    public long getNestedPhone() {
        return nestedPhone;
    }
    
    public void setNestedPhone(long phone) {
        this.nestedPhone = nestedPhone;
    }
    
    @Override
    public String toString() {
        return "User [nestedName=" + nestedName + ", nestedSurname=" + nestedSurname + ", nestedPhone=" + nestedPhone + "]";
    }
}