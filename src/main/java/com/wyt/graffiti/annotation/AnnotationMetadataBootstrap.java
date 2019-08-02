package com.wyt.graffiti.annotation;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

/**
 * @author Darcy
 * @date 2019-07-18 17:41
 */
@TransactionalService
public class AnnotationMetadataBootstrap {
    public static void main(String[] args) throws IOException {
        SimpleMetadataReaderFactory factory = new SimpleMetadataReaderFactory();
        MetadataReader metadataReader = factory.getMetadataReader(TransactionalService.class.getName());
        System.out.println("metadataReader = " + metadataReader);
    }
}
