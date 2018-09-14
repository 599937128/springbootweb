package com.lv.gril.repository;

import com.lv.gril.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: gril
 * @Date: 2018/9/12 21:11
 * @Author: Mr.lv
 * @Description:
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    // 通过年龄来查询
    List<Girl> findByAge(Integer age);

}
