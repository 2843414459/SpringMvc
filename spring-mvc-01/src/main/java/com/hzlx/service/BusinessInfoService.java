package com.hzlx.service;

import com.hzlx.entity.BusinessInfo;

/**
 * spring-mvc
 * 2023/5/11 14:08
 * 星期四
 */
public interface BusinessInfoService {
    BusinessInfo login(String userName,String password);
}
