package hoang.pham.vm.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {

    String accountNumber;

    public AccountNotFoundException(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }
}
