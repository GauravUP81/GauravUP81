package com.flucent.dao;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentDTO extends CreateStudentDTO {

    private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    

}
