package com.wyt.graffiti.annotation.annodrive;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Darcy
 * @date 2019-07-10 11:25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableHelloWorld {
}
