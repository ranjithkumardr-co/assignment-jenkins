package com.arpit.demoarpit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(value="/show", method = RequestMethod.GET)
    public String nothing(){
        return "good to go";
    }

}
