package com.kearmy.test;

import com.kearmy.domain.Account;
import com.kearmy.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testService(){
        accountService.findAllAccount();
        accountService.saveOneAccount(new Account());
    }
}
