package com.lv.gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void insertTwo() {
        Girl girl = new Girl();
        girl.setCupSize("F");
        girl.setAge(18);

        girlRepository.save(girl);

        Girl girl2 = new Girl();
        girl2.setCupSize("D");
        girl2.setAge(19);

        girlRepository.save(girl2);



    }
}
