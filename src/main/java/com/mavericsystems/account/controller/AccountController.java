package com.mavericsystems.account.controller;

import com.mavericsystems.account.model.Account;
import com.mavericsystems.account.service.AccountService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/addAccount")
    public Integer addAccount(@RequestBody Integer customerId){
        Account account = new Account();
        account.setCustomerId(customerId);
        return accountService.createAccount(account).getAccountId();

    }

    @GetMapping("/accountdetails/{id}")
    public Account getAccountDetails(@PathVariable("id") Integer id){
        return accountService.getAccountDetails(id);
    }


}
