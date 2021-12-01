package com.Policyholder360API.models.update;

// Send the keys that you&apos;d like to update, this can be one or more of `f...
public class UpdateUserParams {
  private String content-type;
    
  // The user&apos;s ID (required)
  private String id;
    
  public String getContent-Type() {
            return this.content-type;
  }

  public void setContent-Type(String content-type) {
        this.content-type = content-type;
  }

  // The user&apos;s ID (required)
  public String getId() {
            return this.id;
  }

  // The user&apos;s ID (required)
  public void setId(String id) {
        this.id = id;
  }
}