package com.tuling.orderComparator;

import org.aspectj.weaver.ast.Or;
import org.springframework.core.OrderComparator;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 周瑜
 */
public class Main {

	public static void main(String[] args) {
		A a = new A(); // order=3
		B b = new B(); // order=2

		AnnotationAwareOrderComparator comparator = new AnnotationAwareOrderComparator();
		System.out.println(comparator.compare(a, b));

		List list = new ArrayList<>();
		list.add(a);
		list.add(b);

		// 升序排序
		list.sort(comparator);

		System.out.println(list);
	}
}
