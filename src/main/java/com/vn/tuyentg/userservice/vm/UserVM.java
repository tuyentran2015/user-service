package com.vn.tuyentg.userservice.vm;

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
public class UserVM {
	private int id;
	private String userName;
	private String fullName;
	private String phone;
	private String email;

}
