package com.shanghai.springboot.service;

import com.shanghai.springboot.dao.PersonInfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.*;

@Service
public class ThreadTest {
    @Resource
    private PersonInfoDao dao;
    public  void insertDatas() {
        //ExecutorService executor = Executors.newFixedThreadPool(10);
       ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10000,100,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(5));
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            MyTask myTask = new MyTask(dao,i);
            executor.execute(myTask);
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        executor.shutdown();
    }
}
