package com.ctrip.framework.apollo.portal.auth.defaultimpl;

import com.ctrip.framework.apollo.portal.auth.UserInfoHolder;
import com.ctrip.framework.apollo.portal.entity.po.UserInfo;

/**
 * 不是ctrip的公司默认提供一个假用户
 */
public class DefaultUserInfoHolder implements UserInfoHolder {


  public DefaultUserInfoHolder(){

  }

  @Override
  public UserInfo getUser() {
    UserInfo userInfo = new UserInfo();
    userInfo.setUserId("apollo");
    return userInfo;
  }
}
