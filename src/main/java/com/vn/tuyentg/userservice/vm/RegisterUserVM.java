package com.vn.tuyentg.userservice.vm;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserVM {
	@JsonProperty(value = "user_name")
	private String userName;
	
	@JsonProperty(value = "password")
	private String password;
	@JsonProperty(value = "confirm_password")
	private String confirmPassword;
	
	@JsonProperty(value = "full_name")
	private String fullName;
	
	@JsonProperty(value = "phone")
	private String phone;
	
	@JsonProperty(value = "email")
	private String email;

}
