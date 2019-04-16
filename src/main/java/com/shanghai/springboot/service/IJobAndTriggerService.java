package com.shanghai.springboot.service;


import com.shanghai.springboot.dto.JobAndTrigger;
import com.github.pagehelper.PageInfo;


public interface IJobAndTriggerService {
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
