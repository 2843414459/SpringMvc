package com.hzlx.service.impl;

import com.hzlx.entity.BusinessInfo;
import com.hzlx.mapper.BusinessMapper;
import com.hzlx.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * spring-mvc
 * 2023/5/11 14:08
 * 星期四
 */
@Service
public class BusinessInfoServiceImpl implements BusinessInfoService {


    @Autowired
    BusinessMapper businessMapper;

    @Override
    public BusinessInfo login(String userName, String password) {
        System.out.println(businessMapper);
        System.out.println(userName+password);
        BusinessInfo businessInfo = businessMapper.selectUserNameAndPwd(userName, password);
        return businessInfo;
    }
}
