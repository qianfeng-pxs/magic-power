package com.qianfeng.magic.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*********************************************************
 * 文件名称：TestController
 * 系统名称：交易银行系统V2.0
 * 模块名称：com.qianfeng.magic.core.impl
 * 功能说明：
 * @author：pengxs42098
 * @date：2023/2/28 15:48
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@RestController
@RequestMapping("core")
@RefreshScope
public class TestController {

    @Value("${default.password}")
    private String password;

    @GetMapping("getUserPassword")
    @ResponseBody
    public String getUserConfigTest() {
        return password != null ? password : "未获取到配置";
    }
}
