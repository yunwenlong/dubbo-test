package com.ywl.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ywl.dubbo.demo.DemoService;

public class consumer {

	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-demo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
        
        System.in.read(); // 按任意键退出
    }
	
}
