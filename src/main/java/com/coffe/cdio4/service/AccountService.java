package com.coffe.cdio4.service;

import com.coffe.cdio4.dao.AccountRepo;
import com.coffe.cdio4.model.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private  AccountRepo accountRepo;
    public AccountEntity addAccount(AccountEntity account) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(5);
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return (!accountRepo.existsById(account.getId()) ?
             accountRepo.save(account):null);
    }
}
