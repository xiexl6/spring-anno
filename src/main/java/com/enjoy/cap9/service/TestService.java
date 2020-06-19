package com.enjoy.cap9.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import com.enjoy.cap9.dao.TestDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.enjoy.cap9.dao.TestDao;

@Service
public class TestService {
	@Resource
//    @Qualifier("testDao")//指定名称来加载
	@Autowired
	private TestDao testDao1;//如果使用Autowired, testDao2, 找到TestDao类型的
	
	public void println(){
		System.out.println("Service...dao...."+testDao1);
	}
}
