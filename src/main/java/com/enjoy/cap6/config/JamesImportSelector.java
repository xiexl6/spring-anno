package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Fish;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportSelector implements ImportSelector{

	public String[] selectImports(AnnotationMetadata importingClassMetadata){
		//返回全类名的bean
		return new String[]{Fish.class.getName(),"com.enjoy.cap6.bean.Tiger"};
	}
}
