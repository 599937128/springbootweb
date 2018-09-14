package com.lv.gril.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: gril
 * @Date: 2018/9/13 23:44
 * @Author: Mr.lv
 * @Description:
 */
@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * com.lv.gril.controller.GirlController.*(..))")
    public void log(){
        System.out.println(1234);
    }
}
