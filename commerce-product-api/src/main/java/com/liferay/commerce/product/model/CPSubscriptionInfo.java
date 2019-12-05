/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.product.model;

import com.liferay.portal.kernel.util.UnicodeProperties;

/**
 * @author Alessio Antonio Rendina
 * @author Luca Pellizzon
 */
public class CPSubscriptionInfo {

	@Deprecated
	public CPSubscriptionInfo(
		int subscriptionLength, String subscriptionType,
		UnicodeProperties subscriptionTypeSettingsProperties,
		long maxSubscriptionCycleNumber) {

		this(
			subscriptionLength, subscriptionType,
			subscriptionTypeSettingsProperties, maxSubscriptionCycleNumber, 0,
			null, null, 0);
	}

	public CPSubscriptionInfo(
		int subscriptionLength, String subscriptionType,
		UnicodeProperties subscriptionTypeSettingsProperties,
		long maxSubscriptionCycleNumber, int orderSubscriptionLength,
		String orderSubscriptionType,
		UnicodeProperties orderSubscriptionTypeSettingsProperties,
		long orderMaxSubscriptionCycleNumber) {

		_subscriptionLength = subscriptionLength;
		_subscriptionType = subscriptionType;
		_subscriptionTypeSettingsProperties =
			subscriptionTypeSettingsProperties;
		_maxSubscriptionCycles = maxSubscriptionCycleNumber;
		_orderMaxSubscriptionCycles = orderMaxSubscriptionCycleNumber;
		_orderSubscriptionLength = orderSubscriptionLength;
		_orderSubscriptionType = orderSubscriptionType;
		_orderSubscriptionTypeSettingsProperties =
			orderSubscriptionTypeSettingsProperties;
	}

	public long getMaxSubscriptionCycles() {
		return _maxSubscriptionCycles;
	}

	public long getOrderMaxSubscriptionCycles() {
		return _orderMaxSubscriptionCycles;
	}

	public int getOrderSubscriptionLength() {
		return _orderSubscriptionLength;
	}

	public String getOrderSubscriptionType() {
		return _orderSubscriptionType;
	}

	public UnicodeProperties getOrderSubscriptionTypeSettingsProperties() {
		return _orderSubscriptionTypeSettingsProperties;
	}

	public int getSubscriptionLength() {
		return _subscriptionLength;
	}

	public String getSubscriptionType() {
		return _subscriptionType;
	}

	public UnicodeProperties getSubscriptionTypeSettingsProperties() {
		return _subscriptionTypeSettingsProperties;
	}

	private final long _maxSubscriptionCycles;
	private final long _orderMaxSubscriptionCycles;
	private final int _orderSubscriptionLength;
	private final String _orderSubscriptionType;
	private final UnicodeProperties _orderSubscriptionTypeSettingsProperties;
	private final int _subscriptionLength;
	private final String _subscriptionType;
	private final UnicodeProperties _subscriptionTypeSettingsProperties;

}