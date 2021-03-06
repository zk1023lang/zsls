package com.zsls.controller;

import com.zsls.model.Test1;
import com.zsls.model.Test2;
import com.zsls.service.TestService1;
import com.zsls.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多数据源事务测试
 *
 * @author acer
 *
 */
@RestController
public class TestController {
	@Autowired
	private TestService1 ts1;
	@Autowired
	private TestService2 ts2;

	@RequestMapping("/savetest1")
	public String savetest() {
		Test1 tb = new Test1();
		tb.setName("xxx");
		ts1.db1_savetestBean(tb);
		return "success";
	}

	@RequestMapping("/savetest2")
	public String saveteacher() {
		Test2 tb = new Test2();
		tb.setName("王老师");
		ts2.db2_saveTeacher(tb);
		return "success";
	}


}
