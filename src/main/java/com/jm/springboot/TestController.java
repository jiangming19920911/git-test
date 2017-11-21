package com.jm.springboot;

import com.jm.springboot.model.Product;
import com.jm.springboot.service.SolrProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jm
 */
@RestController
public class TestController {


    @RequestMapping("/index")
    public void index() {
        SolrProductRepository solrProductRepository ;
    }

}
