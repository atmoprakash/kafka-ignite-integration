package com.client.account;


import com.client.account.domain.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {


    @PostMapping(value = "/")
    public Account addAccount(Account account) {
        return new Account();
    }
}
