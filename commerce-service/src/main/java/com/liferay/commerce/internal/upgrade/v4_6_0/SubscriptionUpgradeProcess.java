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

package com.liferay.commerce.internal.upgrade.v4_6_0;

import com.liferay.commerce.model.impl.CommerceSubscriptionEntryImpl;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;

/**
 * @author Luca Pellizzon
 */
public class SubscriptionUpgradeProcess extends UpgradeProcess {

	protected void addColumn(
			Class<?> entityClass, String tableName, String columnName,
			String columnType)
		throws Exception {

		if (_log.isInfoEnabled()) {
			_log.info(
				String.format(
					"Adding column %s to table %s", columnName, tableName));
		}

		if (!hasColumn(tableName, columnName)) {
			alter(
				entityClass,
				new UpgradeProcess.AlterTableAddColumn(
					columnName + StringPool.SPACE + columnType));
		}
		else {
			if (_log.isInfoEnabled()) {
				_log.info(
					String.format(
						"Column %s already exists on table %s", columnName,
						tableName));
			}
		}
	}

	@Override
	protected void doUpgrade() throws Exception {
		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionLength")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionLength", "INTEGER");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionType")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionType", "VARCHAR(75)");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubTypeSettings")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubTypeSettings", "VARCHAR(75)");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryMaxSubscriptionCycles")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryMaxSubscriptionCycles", "LONG");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionStatus")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliverySubscriptionStatus", "INTEGER");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryLastIterationDate")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryLastIterationDate", "DATE");
		}

		if (!hasColumn(
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryNextIterationDate")) {

			addColumn(
				CommerceSubscriptionEntryImpl.class,
				CommerceSubscriptionEntryImpl.TABLE_NAME,
				"deliveryNextIterationDate", "DATE");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SubscriptionUpgradeProcess.class);

}