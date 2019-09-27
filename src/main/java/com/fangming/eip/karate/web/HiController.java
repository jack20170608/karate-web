package com.fangming.eip.karate.web;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hi")
public class HiController {

    @GetMapping("/list")
    public List<String> getAllNames(){
        return Lists.newArrayList("1","2","3");
    }

}
