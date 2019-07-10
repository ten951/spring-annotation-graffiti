package com.wyt.graffiti.annotation.selector;

import org.springframework.stereotype.Component;

/**
 * @author Darcy
 * @date 2019-07-10 11:42
 */
@Component
public class HttpServer implements  Server {
    @Override
    public void start() {
        System.out.println("启动HTTP服务器");
    }

    @Override
    public void stop() {
        System.out.println("关闭HTTP服务器");
    }
}
