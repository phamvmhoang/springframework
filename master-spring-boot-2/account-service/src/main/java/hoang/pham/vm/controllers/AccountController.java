package hoang.pham.vm.controllers;

import hoang.pham.vm.domains.Account;
import hoang.pham.vm.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;


    @PostMapping(value = "/account")
    public Account save(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping(value = "account")
    public Iterable<Account> all(){
        return accountRepository.findAll();
    }

    @GetMapping("/account/{accountId}")
    public Account findAccountById(@PathVariable Integer accountId){
        return accountRepository.findByAccountId(accountId);
    }

    @PutMapping("/account")
    public Account update(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @DeleteMapping("/account")
    public void deleted(@RequestBody Account account){
        accountRepository.delete(account);
    }

    @DeleteMapping("/account/{accountId}")
    public void deleteById(@PathVariable Integer accountId){
        accountRepository.deleteById(accountId);
    }


}
