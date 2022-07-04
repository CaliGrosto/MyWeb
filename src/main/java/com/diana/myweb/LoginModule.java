package com.diana.myweb;

import com.diana.MyBatis.Util.LoginUtils;
import com.diana.MyBatis.Util.MyBatisUtils;
import com.diana.MyBatis.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginModule {

    @RequestMapping("/LoginModule")
    @ResponseBody
    public String LoginModuleA(
            @RequestParam("username")String username,
            @RequestParam("password")String password
            ){
        User user = LoginUtils.LoginUtil(username, password);
        if(user != null){
            return "LoginSuccess";
        }else{
            return "LoginFail";
        }
    }
}
