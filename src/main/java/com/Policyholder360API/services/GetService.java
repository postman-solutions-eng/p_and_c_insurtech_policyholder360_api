package com.Policyholder360API.services;

import com.Policyholder360API.models.get.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface GetService {
  /**
   * Get all users in the system.
   *
   * @param all 
   */
  public Response GetAllUsers(GetAllUsersParams params);

}    