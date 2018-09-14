package com.lv.gril.service;

import com.lv.gril.domain.Girl;
import com.lv.gril.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: gril
 * @Date: 2018/9/12 22:47
 * @Author: Mr.lv
 * @Description:
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girl = new Girl();
        girl.setCupSize("F");
        girl.setAge(18);

        girlRepository.save(girl);

        Girl girl2 = new Girl();
        girl2.setCupSize("Dfff");
        girl2.setAge(19);

        girlRepository.save(girl2);



    }
}
