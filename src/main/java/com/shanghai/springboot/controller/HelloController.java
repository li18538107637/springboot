package com.shanghai.springboot.controller;

import com.shanghai.springboot.service.DubboService;
import com.shanghai.springboot.service.PersonService;
import com.shanghai.springboot.service.ThreadTest;
import com.shanghai.springboot.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class HelloController {
    @Resource
    private PersonService personService;
    @Resource
    private DubboService dubboService;
    @Resource
    private ThreadTest threadTest;
    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("hello")
    public String sayHello(@RequestParam(defaultValue = "abc") String abc, @RequestParam(defaultValue = "abc") String asdss) {

        /*String str = abc;
        String info = personService.getByName("master").toString();

        Person person = new Person();
        person.setMyCollects("456465");
        person.setPersonId("123456");
        person.setPersonName("wyw");
        Integer result = personService.insert(person);*/

        //String name = dubboService.getName("hello");
        //threadTest.insertDatas();
        Boolean result = redisUtils.set("123","456");
        System.out.println(result);

        return "index.html";
    }
}
