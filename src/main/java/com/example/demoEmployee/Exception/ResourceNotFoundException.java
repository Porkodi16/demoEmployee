package com.example.demoEmployee.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttsStatus.NOT_Found)
public class ResourceNotFoundException extends RuntimeException {
	
	private String resourceName;
	private String fieldName;
	private long id;
	

	public ResourceNotFoundException(String resourceName, String fieldName, long id) {
		
		super (String.format("%s not found with %s : %s" , resourceName, fieldName, id));
		this.resourceName=resourceName;
		this.fieldName=fieldName;
		this.id=id;
	}

	public String getResourceName() {
		return resourceName;
	}





	public String getFieldName() {
		return fieldName;
	}


	public long getFieldValue() {
		return id;
	}

	
	
	

}
