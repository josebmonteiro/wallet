package com.wallet.dto;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.Length;

@Data
public class UserDTO {
	
	private Long id;
	
	@Email(message="Email inválido")
	private String email;
	
	@Size(min=3, max=50, message="O nome deve conter entre 3 e 50 caracteres")
	private String name;
	
	@NotNull
	@Size(min=6, message="A senha deve conter no minimo 6 caracteres.")
	private String password;
	
}