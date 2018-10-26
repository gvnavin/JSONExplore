package com.gvnavin.json.gson;

import com.google.gson.Gson;
import com.gvnavin.json.SampleData;
import com.gvnavin.json.model.User;

//http://www.java67.com/2017/05/how-to-convert-json-string-to-java-object-gson-example.html#ixzz4sr1C517Z
public class GsonExample {
    
    
    public static void main(String args[]) {
       
        Gson gson = new Gson();
        User user = gson.fromJson(SampleData.JSON, User.class);
        System.out.println(user);
    }
    
}
