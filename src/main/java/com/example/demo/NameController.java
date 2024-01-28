package com.example.demo;
import com.example.demo.postgres.FirstName;
import com.example.demo.postgres.FirstNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NameController {
    private final FirstNameRepository nameRepository;

    @Autowired
    public NameController(FirstNameRepository nameRepository){
        this.nameRepository = nameRepository;
    }

    @PostMapping("/addName")
    public void addName(@RequestBody FirstName name){
        nameRepository.save(name);
    }

    @PostMapping("/addNameByName")
    public void add(@RequestParam(value = "name") String name){
        FirstName name1 = new FirstName();
        name1.value = name;
        name1.id = nameRepository.count() + 1;
        nameRepository.save(name1);
    }

    @GetMapping("/getNameById")
    public Optional<FirstName> hello(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return nameRepository.findById(id);
    }

    @GetMapping("/getAll")
    public List<FirstName> getAll() {
        return nameRepository.findAll();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
