package hoang.pham.vm.services;

import hoang.pham.vm.domains.Account;
import hoang.pham.vm.exceptions.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class WebAccountService {

    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl = "http://ACCOUNT-SERVICE";

    public Account getByAccountNumber(String accountNumber){
        Account account = restTemplate.getForObject(
                serviceUrl+"/account/{accountId}", Account.class, accountNumber
        );
        if (account == null) {
            throw  new AccountNotFoundException(accountNumber);
        }
        return account;

    }

    public List<Account> getAllAccounts(){
        return restTemplate.getForObject(serviceUrl + "/account", List.class);
    }

}
