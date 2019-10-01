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

package com.liferay.commerce.price.list.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedGroupedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommercePriceList service. Represents a row in the &quot;CommercePriceList&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.price.list.model.impl.CommercePriceListModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.price.list.model.impl.CommercePriceListImpl</code>.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommercePriceList
 * @generated
 */
@ProviderType
public interface CommercePriceListModel
	extends BaseModel<CommercePriceList>, ShardedModel, StagedGroupedModel,
			WorkflowedModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce price list model instance should use the {@link CommercePriceList} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce price list.
	 *
	 * @return the primary key of this commerce price list
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce price list.
	 *
	 * @param primaryKey the primary key of this commerce price list
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this commerce price list.
	 *
	 * @return the uuid of this commerce price list
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this commerce price list.
	 *
	 * @param uuid the uuid of this commerce price list
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the external reference code of this commerce price list.
	 *
	 * @return the external reference code of this commerce price list
	 */
	@AutoEscape
	public String getExternalReferenceCode();

	/**
	 * Sets the external reference code of this commerce price list.
	 *
	 * @param externalReferenceCode the external reference code of this commerce price list
	 */
	public void setExternalReferenceCode(String externalReferenceCode);

	/**
	 * Returns the commerce price list ID of this commerce price list.
	 *
	 * @return the commerce price list ID of this commerce price list
	 */
	public long getCommercePriceListId();

	/**
	 * Sets the commerce price list ID of this commerce price list.
	 *
	 * @param commercePriceListId the commerce price list ID of this commerce price list
	 */
	public void setCommercePriceListId(long commercePriceListId);

	/**
	 * Returns the group ID of this commerce price list.
	 *
	 * @return the group ID of this commerce price list
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this commerce price list.
	 *
	 * @param groupId the group ID of this commerce price list
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this commerce price list.
	 *
	 * @return the company ID of this commerce price list
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce price list.
	 *
	 * @param companyId the company ID of this commerce price list
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce price list.
	 *
	 * @return the user ID of this commerce price list
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce price list.
	 *
	 * @param userId the user ID of this commerce price list
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce price list.
	 *
	 * @return the user uuid of this commerce price list
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce price list.
	 *
	 * @param userUuid the user uuid of this commerce price list
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce price list.
	 *
	 * @return the user name of this commerce price list
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce price list.
	 *
	 * @param userName the user name of this commerce price list
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce price list.
	 *
	 * @return the create date of this commerce price list
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce price list.
	 *
	 * @param createDate the create date of this commerce price list
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce price list.
	 *
	 * @return the modified date of this commerce price list
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce price list.
	 *
	 * @param modifiedDate the modified date of this commerce price list
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the parent commerce price list ID of this commerce price list.
	 *
	 * @return the parent commerce price list ID of this commerce price list
	 */
	public long getParentCommercePriceListId();

	/**
	 * Sets the parent commerce price list ID of this commerce price list.
	 *
	 * @param parentCommercePriceListId the parent commerce price list ID of this commerce price list
	 */
	public void setParentCommercePriceListId(long parentCommercePriceListId);

	/**
	 * Returns the name of this commerce price list.
	 *
	 * @return the name of this commerce price list
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this commerce price list.
	 *
	 * @param name the name of this commerce price list
	 */
	public void setName(String name);

	/**
	 * Returns the commerce currency code of this commerce price list.
	 *
	 * @return the commerce currency code of this commerce price list
	 */
	@AutoEscape
	public String getCommerceCurrencyCode();

	/**
	 * Sets the commerce currency code of this commerce price list.
	 *
	 * @param commerceCurrencyCode the commerce currency code of this commerce price list
	 */
	public void setCommerceCurrencyCode(String commerceCurrencyCode);

	/**
	 * Returns the priority of this commerce price list.
	 *
	 * @return the priority of this commerce price list
	 */
	public double getPriority();

	/**
	 * Sets the priority of this commerce price list.
	 *
	 * @param priority the priority of this commerce price list
	 */
	public void setPriority(double priority);

	/**
	 * Returns the display date of this commerce price list.
	 *
	 * @return the display date of this commerce price list
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this commerce price list.
	 *
	 * @param displayDate the display date of this commerce price list
	 */
	public void setDisplayDate(Date displayDate);

	/**
	 * Returns the expiration date of this commerce price list.
	 *
	 * @return the expiration date of this commerce price list
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this commerce price list.
	 *
	 * @param expirationDate the expiration date of this commerce price list
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the last publish date of this commerce price list.
	 *
	 * @return the last publish date of this commerce price list
	 */
	@Override
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this commerce price list.
	 *
	 * @param lastPublishDate the last publish date of this commerce price list
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate);

	/**
	 * Returns the status of this commerce price list.
	 *
	 * @return the status of this commerce price list
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this commerce price list.
	 *
	 * @param status the status of this commerce price list
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this commerce price list.
	 *
	 * @return the status by user ID of this commerce price list
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this commerce price list.
	 *
	 * @param statusByUserId the status by user ID of this commerce price list
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this commerce price list.
	 *
	 * @return the status by user uuid of this commerce price list
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this commerce price list.
	 *
	 * @param statusByUserUuid the status by user uuid of this commerce price list
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this commerce price list.
	 *
	 * @return the status by user name of this commerce price list
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this commerce price list.
	 *
	 * @param statusByUserName the status by user name of this commerce price list
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this commerce price list.
	 *
	 * @return the status date of this commerce price list
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this commerce price list.
	 *
	 * @param statusDate the status date of this commerce price list
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this commerce price list is approved.
	 *
	 * @return <code>true</code> if this commerce price list is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this commerce price list is denied.
	 *
	 * @return <code>true</code> if this commerce price list is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this commerce price list is a draft.
	 *
	 * @return <code>true</code> if this commerce price list is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this commerce price list is expired.
	 *
	 * @return <code>true</code> if this commerce price list is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this commerce price list is inactive.
	 *
	 * @return <code>true</code> if this commerce price list is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this commerce price list is incomplete.
	 *
	 * @return <code>true</code> if this commerce price list is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this commerce price list is pending.
	 *
	 * @return <code>true</code> if this commerce price list is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this commerce price list is scheduled.
	 *
	 * @return <code>true</code> if this commerce price list is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CommercePriceList commercePriceList);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommercePriceList> toCacheModel();

	@Override
	public CommercePriceList toEscapedModel();

	@Override
	public CommercePriceList toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}