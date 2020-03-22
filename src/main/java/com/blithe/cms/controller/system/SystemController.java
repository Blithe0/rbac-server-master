package com.blithe.cms.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: SystemController
 * @Description: 跳转Controller
 * @Author: 夏小颜
 * @Date: 9:59
 * @Version: 1.0
 **/
@Controller
public class SystemController {


    /**
     * 系统登陆页
     */
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }


    /**
     * 系统主页
     */
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }


    /**
     * main 工作空间页面
     */
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    /**
     * 登陆日志信息页
     */
    @RequestMapping("/sys/toLogInfoManager")
    public String toLogInfoManager(){
        return "system/logInfo";
    }

    /**
     * 系统公告页
     */
    @RequestMapping("/sys/toNoticeManager")
    public String toNoticeManager(){
        return "system/notice";
    }

}