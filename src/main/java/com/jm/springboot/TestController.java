package com.jm.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jm
 */
@RestController
public class TestController {


    @RequestMapping("/index")
    public void index() {
        System.out.println("1");
    }

}
