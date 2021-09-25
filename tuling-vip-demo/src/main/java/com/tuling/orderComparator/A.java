package com.tuling.orderComparator;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author 周瑜
 */
@Order(3)
public class A {

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
