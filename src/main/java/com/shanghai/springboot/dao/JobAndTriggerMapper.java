package com.shanghai.springboot.dao;

import com.shanghai.springboot.dto.JobAndTrigger;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JobAndTriggerMapper {
	@Autowired
	public SqlSession sqlSession;
	public List<JobAndTrigger> getJobAndTriggerDetails() {
		return sqlSession.selectList("JobAndTriggerMapper.getJobAndTriggerDetails");
	}
}
