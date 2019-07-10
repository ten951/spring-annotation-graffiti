package com.wyt.graffiti.annotation.annodrive;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author Darcy
 * @date 2019-07-10 11:27
 */
@EnableHelloWorld
@Configuration
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        /*构建Annotation配置驱动Spring上下文*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /*注册当期引导类(带@Configuration标注的)到Spring上下文*/
        context.register(EnableHelloWorldBootstrap.class);
        /*启动上下文*/
        context.refresh();
        /*获取名称为helloWorld的bean对象*/
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld = " + helloWorld);
        /*关闭上下文*/
        context.close();
    }
}
