package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.interfaces.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 80657 on 2017/10/31.
 */


@RestController
public class Home {

    @Reference
    DemoService demoService;


    @GetMapping("index")
    public String test() {
        if (demoService!=null){
         List<String> list=demoService.getPermissions(20l);
            System.out.println(list.get(1));
        }


      /*  ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        List<String> list = demoService.getPermissions(10l);*/
        return demoService.getPermissions(20l).get(2);
    }

}
