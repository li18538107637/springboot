package com.shanghai.springboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shanghai.springboot.dao.JobAndTriggerMapper;
import com.shanghai.springboot.dto.JobAndTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IJobAndTriggerServiceImpl implements IJobAndTriggerService {
        @Autowired
        private JobAndTriggerMapper jobAndTriggerMapper;

        public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
            PageHelper.startPage(pageNum, pageSize);
            List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
            PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
            return page;
        }
}
