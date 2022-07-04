package com.diana.MyBatis.Mapper;

import com.diana.MyBatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface ParameterMapper {

    /**
     * 登录功能
     */
    User LoginModule(@Param("username")String username, @Param("password")String password);

}
