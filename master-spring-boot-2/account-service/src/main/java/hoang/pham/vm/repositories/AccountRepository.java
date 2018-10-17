package hoang.pham.vm.repositories;

import hoang.pham.vm.domains.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Integer > {

    List<Account> findAllByCustomerId(Integer id);

    List<Account> findAllByAccountType(String accountType);

    List<Account> findByBank(String bank);

    Account findByAccountId(Integer accountId);
}
