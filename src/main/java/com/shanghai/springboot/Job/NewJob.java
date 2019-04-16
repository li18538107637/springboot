package com.shanghai.springboot.Job;

import com.shanghai.springboot.utils.BaseJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class NewJob implements BaseJob {
    private static  Logger log = LoggerFactory.getLogger(NewJob.class);

    public NewJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("NewJob执行时间"+new Date());
    }
}
