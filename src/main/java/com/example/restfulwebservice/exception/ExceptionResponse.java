package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor // default constructor(no argument)
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
