package com.kearmy.service.impl;

import com.kearmy.dao.AccountDao;
import com.kearmy.domain.Account;
import com.kearmy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl  implements IAccountService {

    @Autowired
    private  AccountDao accountDao;
    @Override
    public List<Account> findAllAccount() {
        System.out.println("业务层：查询所有");
        return accountDao.findAll();
    }

    @Override
    public void saveOneAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("保存一个账户");
    }
}
