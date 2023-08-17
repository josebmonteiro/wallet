package com.wallet.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "`user`")
public class User implements Serializable {
	
	private static final long serialVersionUID = 296956220496377784L;

	@Id
	//@GeneratedValue(strategy = G)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	//@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
}
