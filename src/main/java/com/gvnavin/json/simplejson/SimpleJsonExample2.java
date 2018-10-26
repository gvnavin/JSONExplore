package com.gvnavin.json.simplejson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.gvnavin.json.SampleData;
import com.gvnavin.json.model.NestedUser;
import com.gvnavin.json.model.User;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

//http://javarevisited.blogspot.in/2014/12/how-to-read-write-json-string-to-file.html
public class SimpleJsonExample2 {
    
    public static void main(String args[]) throws ParseException, IOException {
        
        JSONParser parser = new JSONParser();
        
        // One advantage is that here no need to provide target class
        // used for deserialization unlike other deserializers
        JSONObject json = (JSONObject) parser.parse(SampleData.JSON_NESTED);
        
        System.out.println("json = " + json);
    
        final Object name = json.get("name");
        System.out.println("name = " + name);
    
        final Object surname = json.get("surname");
        System.out.println("surname = " + surname);
    
        final Object phone = json.get("phone");
        System.out.println("phone = " + phone);
    
        final Object nestedObject = json.get("nestedObject");
        System.out.println("nestedObject = " + nestedObject);
        
        Gson gson = new Gson();
        NestedUser nestedUser = gson.fromJson(nestedObject.toString(), NestedUser.class);
        System.out.println("nestedUser-gson = " + nestedUser);
        
        NestedUser nestedUser2 = new ObjectMapper().readValue(nestedObject.toString(), NestedUser.class);
        System.out.println("nestedUser-jackson = " + nestedUser2);
    }
    
}
