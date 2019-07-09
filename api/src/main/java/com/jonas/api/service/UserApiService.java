package com.jonas.api.service;

import com.jonas.api.dto.User;
import com.jonas.constant.BizException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/10/25
 */
@FeignClient(value = "spring-cloud-server", url="${uc.host}", path = "/user")
public interface UserApiService {

    /**
     * 获取单个用户
     * @param uid
     * @return
     */
    @RequestMapping("/getUser")
    User getUser(@RequestParam("uid") Long uid) throws BizException;

    @PostMapping("/test")
    Integer test();
}
