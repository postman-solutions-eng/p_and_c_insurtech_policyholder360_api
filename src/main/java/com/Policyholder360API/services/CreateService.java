package com.Policyholder360API.services;

import com.Policyholder360API.models.create.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface CreateService {
  /**
   * Creates a new user in the system. The user will be assigned ...
   *
   * @param contentType 
   */
  public Response NewUser(NewUserParams params);

}    