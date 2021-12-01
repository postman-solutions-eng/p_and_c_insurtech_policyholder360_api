package com.Policyholder360API.services;

import com.Policyholder360API.models.update.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

public interface UpdateService {
  /**
   * Send the keys that you&apos;d like to update, this can be one or ...
   *
   * @param contentType 
   * @param id The user&apos;s ID (required)
   */
  public Response UpdateUser(UpdateUserParams params);

}    