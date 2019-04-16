package com.shanghai.springboot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shanghai.springboot.dao.CityDao;

import javax.annotation.Resource;
@org.springframework.stereotype.Service
public class DubboService {
    @Reference
    private DubboServiceTest dubboServiceTest;

    @Resource
    private CityDao dao;
    public String   getName(String name){
        //return dao.selectPersonByName(name).getPersonName();
        return dubboServiceTest.getName(name);
    }
}
