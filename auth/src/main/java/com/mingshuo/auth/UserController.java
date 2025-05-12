package com.mingshuo.auth;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/")
public class UserController {
    @RequestMapping("token")
    public SaResult getTokenInfo() {
        return SaResult.data(StpUtil.getTokenInfo());
    }
}
