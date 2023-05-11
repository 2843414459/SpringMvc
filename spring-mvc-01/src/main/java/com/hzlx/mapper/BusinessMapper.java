package com.hzlx.mapper;

import com.hzlx.entity.BusinessInfo;
import org.apache.ibatis.annotations.Param;

/**
 * spring-mvc
 * 2023/5/11 14:38
 * 星期四
 */
public interface BusinessMapper {
    BusinessInfo selectUserNameAndPwd(@Param("userName") String userName, @Param("password") String password);
}
