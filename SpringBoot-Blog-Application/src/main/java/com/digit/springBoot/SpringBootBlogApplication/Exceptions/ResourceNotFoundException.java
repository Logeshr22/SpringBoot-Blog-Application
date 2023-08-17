package com.digit.springBoot.SpringBootBlogApplication.Exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends Exception {
	@SuppressWarnings("unused")
	private String ResourceName;
	@SuppressWarnings("unused")
	private String fieldName;
	@SuppressWarnings("unused")
	private String fieldValue;

	public String getResourceName() {
		return ResourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with $s : '%s'", resourceName, fieldName, fieldValue));
		// post not found with id : 1
		ResourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
