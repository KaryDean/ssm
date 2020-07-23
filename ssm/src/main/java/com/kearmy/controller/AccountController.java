package com.kearmy.controller;

import com.kearmy.domain.Account;
import com.kearmy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户");
        List<Account> accountList = accountService.findAllAccount();
        model.addAttribute("accountList", accountList);
        return  "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){

        accountService.saveOneAccount(account);

        return "redirect:/account/findAll";
    }
}
