package com.ywl.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-demo-provider.xml"});
        context.start();
        System.out.println("Provider.start....");
        System.in.read(); // 按任意键退出
    }

}
