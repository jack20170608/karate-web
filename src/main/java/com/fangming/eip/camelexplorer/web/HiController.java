package com.fangming.eip.camelexplorer.web;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HiController {

//    @GetMapping("/{id}")
//    public String sayHi(@PathVariable String name){
//        return "hi, " + name;
//    }

    @GetMapping("/list")
    public List<String> getAllNames(){
        return Lists.newArrayList("1","2","3");
    }

}
