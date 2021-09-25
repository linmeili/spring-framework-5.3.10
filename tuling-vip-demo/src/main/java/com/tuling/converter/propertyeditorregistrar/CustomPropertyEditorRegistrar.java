package com.tuling.converter.propertyeditorregistrar;

import com.tuling.converter.propertyeditor.StringToUserPropertyEditor;
import com.tuling.converter.User;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author 周瑜
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {

		// 属性名字为user，类型为User，使用StringToUserPropertyEditor将字符串转化为User类型
		registry.registerCustomEditor(User.class, "user", new StringToUserPropertyEditor());
	}
}
