package com.example.demo.uxt.demospringwebmvc;


public class User {

	private String id ;
    private String firstName;
    private String lastName;

    public User() {
		super();
	}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
