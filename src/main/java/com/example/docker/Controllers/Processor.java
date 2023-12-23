package com.example.docker.Controllers;

import com.example.docker.entity.DemoEntity;
import com.example.docker.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/base")

public class Processor {
    @Autowired
    DemoRepository demoRepository;
    @PostMapping(path = "/add")
    public ResponseEntity add(@RequestBody DemoEntity entity){
        DemoEntity results=demoRepository.save(entity);
        return new ResponseEntity<>(results, HttpStatus.OK);

    }
    @GetMapping(path = "/all")
    public ResponseEntity<List<DemoEntity>>getAll(){
        List<DemoEntity>demoEntityList=demoRepository.findAll();
        return new ResponseEntity<>(demoEntityList,HttpStatus.OK);
    }
    @PostMapping(path = "/test")
    public String getData(){
        return "I am fine";
    }
}
