package com.gvnavin.json.jackson;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gvnavin.json.SampleData;
import com.gvnavin.json.model.User;

import java.io.IOException;

//http://javarevisited.blogspot.com/2013/02/how-to-convert-json-string-to-java-object-jackson-example-tutorial.html#ixzz4sr0PBTpf
public class JacksonExample {
    
    public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {
        
        //converting JSON String to Java object
        fromJson(SampleData.JSON);
    }
    
    public static Object fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
        
        User garima = new ObjectMapper().readValue(json, User.class);
        
        System.out.println("Java Object created from JSON String ");
        System.out.println("JSON String : " + json);
        System.out.println("Java Object : " + garima);
        
        return garima;
    }
}
