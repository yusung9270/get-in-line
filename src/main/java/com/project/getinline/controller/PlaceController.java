package com.project.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/places")
public class PlaceController {

    @GetMapping("/")
    public String places(){
        return "places/index";
    }

    @GetMapping("/{placeId}")
    public String places(@PathVariable Integer placeId){
        return "places/detail";
    }
}
