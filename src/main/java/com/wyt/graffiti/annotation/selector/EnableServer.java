package com.wyt.graffiti.annotation.selector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Darcy
 * @date 2019-07-10 13:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ServerImportSelector.class)
public @interface EnableServer {
    Server.Type type();
}
