package net.javaguides.banking_app.service;

import java.util.List;

import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

public interface AccountService {

	AccountDto createAccount(AccountDto acccount);
	AccountDto getAccountById(Long id);
	AccountDto deposit(Long id , double amount);
	AccountDto withdraw(Long id , double amount);
	List<AccountDto> getAllAccounts();
	void deleteAccount(Long id);
}
