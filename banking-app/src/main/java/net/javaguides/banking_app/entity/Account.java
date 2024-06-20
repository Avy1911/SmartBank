package net.javaguides.banking_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {

	//enables primary key
	@Id
	//increments key for each row
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;
	
	public Account() {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

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

	public Account(Long id, String accountHolderName, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
