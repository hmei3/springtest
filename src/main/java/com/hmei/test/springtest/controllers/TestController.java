package com.hmei.test.springtest.controllers;

import com.hmei.test.springtest.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class TestController {
    @GetMapping(value = "helloUser")
    public ResponseEntity<String> helloUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            List<ObjectError> errors = bindingResult.getAllErrors();

        }
        return ResponseEntity.ok("done");
    }
    @GetMapping(value = "")
    public String hello() {
        return "Hello";
    }
}
