package com.lv.gril.controller;

import com.lv.gril.domain.Girl;
import com.lv.gril.repository.GirlRepository;
import com.lv.gril.service.GirlService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: gril
 * @Date: 2018/9/12 21:10
 * @Author: Mr.lv
 * @Description:
 */
@RestController
@Slf4j
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     *  查询所有的女生的列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        System.out.print("2345");
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl addgirl(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            System.out.print(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());

        return girlRepository.save(girl);
    }

    // 查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }
    //更新
    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }

    // 通过年龄来查询女生列表
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void twoGirl() {
        girlService.insertTwo();
    }

    //测试事务的使用
}
