package com.tuling.orderComparator;

import org.springframework.core.annotation.Order;

/**
 * @author 周瑜
 */
@Order(2)
public class B {

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
