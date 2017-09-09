package com.ywl.dubbo.service.impl;

import com.ywl.dubbo.demo.DemoService;

public class DemoServiceIml implements DemoService {

	public String sayHello(String name) {
		return "hello:" + name;
	}

}
