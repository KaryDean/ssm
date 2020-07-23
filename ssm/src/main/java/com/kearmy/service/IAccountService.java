package com.kearmy.service;

import com.kearmy.domain.Account;

import java.util.List;

public interface IAccountService {

    //查询所有账户
    public List<Account> findAllAccount();

    //保存账户
    public void saveOneAccount(Account account);

}
