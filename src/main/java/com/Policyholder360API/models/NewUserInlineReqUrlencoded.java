package com.Policyholder360API.models;

public class NewUserInlineReqUrlencoded {
  // The user&apos;s first name (required)
  private String firstname;
    
  // The user&apos;s last name (required)
  private String lastname;
    
  // The user&apos;s password (required)
  private String password;
    
  // The user&apos;s first name (required)
  public String getFirstName() {
        return this.firstname;
  }

  // The user&apos;s first name (required)
  public void setFirstName(String firstname) {
        this.firstname = firstname;
  }

  // The user&apos;s last name (required)
  public String getLastName() {
        return this.lastname;
  }

  // The user&apos;s last name (required)
  public void setLastName(String lastname) {
        this.lastname = lastname;
  }

  // The user&apos;s password (required)
  public String getPassword() {
        return this.password;
  }

  // The user&apos;s password (required)
  public void setPassword(String password) {
        this.password = password;
  }
}
