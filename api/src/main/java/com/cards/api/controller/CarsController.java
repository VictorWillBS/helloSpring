package com.cards.api.controller;

import com.cards.api.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarsController {
    @GetMapping()
    public String getCar(){
        return "cheguei";
    }
@PostMapping()
    public void createCar(@RequestBody CarDTO body) {
        System.out.println(body);
    }
}
