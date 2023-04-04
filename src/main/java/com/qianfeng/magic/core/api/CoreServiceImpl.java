package com.qianfeng.magic.core.api;

import com.qianfeng.magic.api.core.CoreService;
import org.apache.dubbo.config.annotation.DubboService;

/*********************************************************
 * 文件名称：CoreServiceImpl
 * 系统名称：交易银行系统V2.0
 * 模块名称：com.qianfeng.magic.core.impl
 * 功能说明：
 * @author：pengxs42098
 * @date：2023/3/15 19:37
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@DubboService
public class CoreServiceImpl implements CoreService {
    @Override
    public String getServiceName() {
        return "magic-core";
    }
}
