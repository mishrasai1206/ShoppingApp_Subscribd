package com.subscribd.Project_Subscribd.Config;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private int status;
	private String message;
	private Object data;

}
