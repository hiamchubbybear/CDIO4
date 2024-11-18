package com.coffe.cdio4.controller;

import com.coffe.cdio4.model.AccountEntity;
import com.coffe.cdio4.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/account")
@RequiredArgsConstructor
public class AccountController {
    private final   AccountService accountService;
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody final AccountEntity account) {
        return ResponseEntity.ok().body(accountService.addAccount(account));
    }

}
