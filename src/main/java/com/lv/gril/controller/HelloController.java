package com.lv.gril.controller;

import com.lv.gril.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: gril
 * @Date: 2018/9/11 19:47
 * @Author: Mr.lv
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    @GetMapping("/say/{id}")
    public String say(@PathVariable("id") Integer id) {
       return "id:" + id;
    }

    //使用? 拼接参数的方式使用(id=123)的注解required = false设置是否是必传
    @GetMapping("/say2")
    public String say2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id:" + myId;
    }
}
