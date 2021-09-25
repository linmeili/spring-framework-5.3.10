package com.tuling.converter.propertyeditor;

import com.tuling.converter.User;

/**
 * @author 周瑜
 */
public class PropertyEditorDemo {

	public static void main(String[] args) {
		StringToUserPropertyEditor editor = new StringToUserPropertyEditor();
		editor.setAsText("zhouyu");

		User result = (User) editor.getValue();
		System.out.println(result.getName());
	}
}
