package com.manoharadepu.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/getInfo")
public class InfoController {

    @GetMapping
    public String getNames(){
        String[] names = new String[4];
        names[0] = "Manohar";
        names[1] = "Soujanya";
        names[2] = "Sagarika";
        names[3] = "Sunil";

        return Arrays.toString(names);
    }
}
