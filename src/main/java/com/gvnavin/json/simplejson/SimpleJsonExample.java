package com.gvnavin.json.simplejson;

import com.gvnavin.json.SampleData;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//http://javarevisited.blogspot.in/2014/12/how-to-read-write-json-string-to-file.html
public class SimpleJsonExample {
    
    public static void main(String args[]) throws ParseException {
        
        JSONParser parser = new JSONParser();
        
        // One advantage is that here no need to provide target class
        // used for deserialization unlike other deserializers
        JSONObject json = (JSONObject) parser.parse(SampleData.JSON);
        
        System.out.println("json = " + json);
    
        final Object name = json.get("name");
        System.out.println("name = " + name);
    
        final Object surname = json.get("surname");
        System.out.println("surname = " + surname);
    
        final Object phone = json.get("phone");
        System.out.println("phone = " + phone);
    }
    
}
