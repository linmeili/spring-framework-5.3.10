package com.tuling.annotationMetadata;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * @author 周瑜
 */
public class Main {

	public static void main(String[] args) throws IOException {


//		AnnotationMetadata metadata = AnnotationMetadata.introspect(UserService.class);

//		System.out.println(metadata.hasAnnotation(Service.class.getName()));		// true
//		System.out.println(metadata.hasMetaAnnotation(Service.class.getName()));	// false
//
//		System.out.println(metadata.hasAnnotation(Component.class.getName()));		// false
//		System.out.println(metadata.hasMetaAnnotation(Component.class.getName()));	// true
//
//		System.out.println(metadata.hasAnnotatedMethods(Bean.class.getName()));		// true

//		for (MergedAnnotation<Annotation> annotation : metadata.getAnnotations()) {
//			System.out.println(annotation.getType());
//		}

	}
}
