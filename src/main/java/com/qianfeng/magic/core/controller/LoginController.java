package com.qianfeng.magic.core.controller;

import com.qianfeng.magic.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************
 * 文件名称：LoginController
 * 系统名称：交易银行系统V2.0
 * 模块名称：com.qianfeng.magic.core.controller
 * 功能说明：
 * @author：pengxs42098
 * @date：2023/3/21 16:13
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@RestController
@RequestMapping("core")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("login")
    public String login(){
        return loginService.login();
    }
}
