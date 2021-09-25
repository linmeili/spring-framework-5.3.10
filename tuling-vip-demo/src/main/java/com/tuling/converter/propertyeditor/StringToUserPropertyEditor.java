package com.tuling.converter.propertyeditor;

import com.tuling.converter.User;

import java.beans.PropertyEditorSupport;

/**
 * 将String转化为User类型
 * 在Spring中内置了很多PropertyEditorSupport的实现
 * org.springframework.beans.propertyeditors
 * @author 周瑜
 */
public class StringToUserPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		User user = new User();
		user.setName(text);

		setValue(user);
	}
}
