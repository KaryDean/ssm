package com.kearmy.dao;

import com.kearmy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户
    @Insert("insert into account(name, money) values(#{name}, #{money})")
    public void saveAccount(Account account);
}
