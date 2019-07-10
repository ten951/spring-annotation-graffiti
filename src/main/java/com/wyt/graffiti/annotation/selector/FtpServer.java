package com.wyt.graffiti.annotation.selector;

/**
 * @author Darcy
 * @date 2019-07-10 11:47
 */
public class FtpServer implements Server {
    @Override
    public void start() {
        System.out.println("启动FTP服务器");
    }

    @Override
    public void stop() {
        System.out.println("关闭FTP服务器");
    }
}
