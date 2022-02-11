package com.mavericsystems.account.service;

import com.mavericsystems.account.model.Account;

public interface AccountService {
    Account createAccount(Account account);
    Account getAccountDetails(Integer id);

}
