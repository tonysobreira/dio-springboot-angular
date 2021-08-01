package com.digital.crud.saladereuniao.exception;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;

}
