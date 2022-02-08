package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@Min(value = 1)
	private int eid;

	@NotEmpty(message = "Name Shouldn't be empty!!")
	@Size(min = 6, max = 18, message = "Name should be in the range (6-18) characters length")
	private String ename;

	@NotEmpty(message = "Email Shouldn't be empty!!")
	@Email(message = "Your enter email is invalid format")
	private String eemail;

	@NotNull(message = "Mobile Shouldn't be empty!!")
	@Positive
	private long emobile;

}
