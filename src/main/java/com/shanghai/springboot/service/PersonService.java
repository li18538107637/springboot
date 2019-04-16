package com.shanghai.springboot.service;

import com.shanghai.springboot.dao.CityDao;
import com.shanghai.springboot.dto.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class PersonService {
    @Resource
    private CityDao dao;

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        String str1 = "aaaaa";
        String str2 = "abcdefg";
        String[] charArray = str2.split("");
        StringBuilder sbd = new StringBuilder(str2);
        for(int i=charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
        System.out.println(sbd.reverse().toString());
    }

    public Person getByName(String name) {
        Person person = dao.selectPersonByName(name);
        return person;
    }
    @Transactional(noRollbackFor=RuntimeException.class)
    public int insert(Person person) {
        Map<String,String> map = new HashMap<>();

        int result = dao.insertPerson(person);
        if(true){
            throw new RuntimeException("hava a exception");
        }
        return 1;
    }

}
