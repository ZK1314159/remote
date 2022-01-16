package com.example.remote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author zengkai
 * Date: 2022/1/16 9:57
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam Integer id) {
        return "success";
    }

}
