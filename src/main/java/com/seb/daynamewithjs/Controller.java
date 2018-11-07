package com.seb.daynamewithjs;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    DataRepository dataRepository;
    @CrossOrigin
    @RequestMapping("/save")
    public String saveData(@RequestBody Data data){

        dataRepository.save(data);

        return "A data is been saved";

    }

}
