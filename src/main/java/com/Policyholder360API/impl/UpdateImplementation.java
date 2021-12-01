package com.Policyholder360API.impl;


import javax.ws.rs.core.Response;
import com.Policyholder360API.models.*;
import com.Policyholder360API.resources.UpdateResource;
import com.Policyholder360API.services.UpdateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.Policyholder360API.models.update.*;
public class UpdateImplementation implements UpdateService {
// Implement your logic here

            
  /**
   * Send the keys that you&apos;d like to update, this can be one or ...
   *
   * @param contentType 
   * @param id The user&apos;s ID (required)
   */
  @Override
  public Response UpdateUser(UpdateUserParams params) {
    // Your code here


    //create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    Updateuser updateuser = null;

    try {
      //convert json string to object
      updateuser = objectMapper.readValue("{\"firstName\":\"Benjamin\",\"id\":\"0729d37c-ef9f-4ffa-8f71-a6eedf1f95b7\",\"lastName\":\"Smith\",\"status\":\"success\"}", Updateuser.class);
    } catch (JsonProcessingException jpe) {
      jpe.printStackTrace();
    }

    return Response.status(200).entity(updateuser).build();                             
  }        }




    