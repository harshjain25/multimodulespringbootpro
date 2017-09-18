package com.demo.multimodulepro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping(value = "/get/test", method = RequestMethod.GET)
    public ResponseEntity test(){

        return new ResponseEntity("{  \n" +
                "   \"status\":\"sample success\"\n" +
                "}", HttpStatus.OK);
    }
}
