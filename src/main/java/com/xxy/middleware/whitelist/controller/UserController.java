package com.xxy.middleware.whitelist.controller;

import com.xxy.middleware.whitelist.annotation.DoWhiteList;
import com.xxy.middleware.whitelist.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @DoWhiteList(key = "id", returnJson = "{\"coddee\":\"1234\",\"msg\":\"拦截！\"}")
    @PostMapping("/api/queryUserInfo")
    public UserInfo queryUserInfo(@RequestParam String id) {
        logger.info("查询用户信息, userId = {}", id);
        return new UserInfo("张三" + id, 18, "上海");
    }
}
