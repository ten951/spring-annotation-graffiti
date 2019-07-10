package com.wyt.graffiti.annotation.selector;

/**
 * @author Darcy
 * @date 2019-07-10 11:40
 */
public interface Server {
    /**
     * 启动
     */
    void start();

    /**
     * 关闭
     */
    void stop();

    enum Type {

        /**
         * HTTP
         */
        HTTP,

        /**
         *FTP
         */
        FTP
    }
}
