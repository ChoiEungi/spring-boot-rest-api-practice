package com.example.restfulwebservice.helloworld;
// lombok : setter getter auto making

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter and setter
@AllArgsConstructor // constructor
@NoArgsConstructor // default constructor
public class HelloWorldBean {
    private String message;

//    public HelloWorldBean(String message){
//        this.message = message;
//    } -> duplicate lombok AllArgsConstructor, so don't need to create constructor

}
