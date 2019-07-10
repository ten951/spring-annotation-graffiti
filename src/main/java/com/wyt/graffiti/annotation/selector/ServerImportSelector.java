package com.wyt.graffiti.annotation.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author Darcy
 * @date 2019-07-10 13:57
 */
public class ServerImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(EnableServer.class.getName());
        assert annotationAttributes != null;
        Server.Type type = (Server.Type) annotationAttributes.get("type");
        String[] importClassNames = new String[0];
        switch (type) {
            case FTP:
                importClassNames = new String[]{FtpServer.class.getName()};
                break;
            case HTTP:
                importClassNames = new String[]{HttpServer.class.getName()};
                break;
            default:
        }
        return importClassNames;
    }
}
