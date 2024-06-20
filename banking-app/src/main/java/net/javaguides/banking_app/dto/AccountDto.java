package net.javaguides.banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

	private Long id;
	private String accountHolderName;
	private double Balance;
	
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	public AccountDto(Long id, String accountHolderName, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		Balance = balance;
	}
	
	
}
