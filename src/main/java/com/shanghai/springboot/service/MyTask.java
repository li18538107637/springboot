package com.shanghai.springboot.service;

import com.shanghai.springboot.dao.PersonInfoDao;
import com.shanghai.springboot.dto.PersonInfo;
import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.Random;

public class MyTask implements Runnable {
    private PersonInfoDao dao;
    private int taskNum;
    private String[] strs = new String[]{"a", "s", "w", "c", "x"};

    public MyTask(PersonInfoDao dao, int taskNum) {
        this.dao = dao;
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行task " + taskNum);
        StringBuffer buffer = new StringBuffer("");
        Random ra = new Random();
        for (int i = 0; i < strs.length; i++) {
            int num = ra.nextInt(strs.length);
            buffer.append(strs[num]);
        }
        dao.insertPerson(new PersonInfo(buffer.toString(), "1"));
        System.out.println("task " + taskNum + "执行完毕");
    }

    public static void main(String[] args) {
        String paassword = "123456";

        Md5Hash md5Hash = new Md5Hash(paassword,"anying",3);
        Md5Hash md5Hash2 = new Md5Hash(paassword,"anying",3);
        System.out.println(md5Hash);
        System.out.println(md5Hash2);

    }
}
