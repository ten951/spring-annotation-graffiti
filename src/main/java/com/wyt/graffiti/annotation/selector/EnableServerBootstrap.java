package com.wyt.graffiti.annotation.selector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author Darcy
 * @date 2019-07-10 14:06
 */
@Configuration
@EnableServer(type = Server.Type.FTP)
public class EnableServerBootstrap {
    public static void main(String[] args) {
        /*构建Annotation配置驱动Spring上下文*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        /*注册当期引导类(带@Configuration标注的)到Spring上下文*/
        context.register(EnableServerBootstrap.class);
        /*启动上下文*/
        context.refresh();
        Server bean = context.getBean(Server.class);
        bean.start();
        bean.stop();

    }
}
