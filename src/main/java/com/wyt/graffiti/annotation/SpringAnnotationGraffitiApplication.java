package com.wyt.graffiti.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author yongtianwang
 */
@EnableRedisHttpSession
@SpringBootApplication
public class SpringAnnotationGraffitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAnnotationGraffitiApplication.class, args);
    }

}
