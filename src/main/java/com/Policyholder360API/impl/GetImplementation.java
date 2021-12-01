package com.Policyholder360API.impl;


import javax.ws.rs.core.Response;
import com.Policyholder360API.models.*;
import com.Policyholder360API.resources.GetResource;
import com.Policyholder360API.services.GetService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.Policyholder360API.models.get.*;
public class GetImplementation implements GetService {
// Implement your logic here

        
  /**
   * Get all users in the system.
   *
   * @param all 
   */
  @Override
  public Response GetAllUsers(GetAllUsersParams params) {
    // Your code here


    //create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    GetAllUsersInlineResp getallusersinlineresp = null;

    try {
      //convert json string to object
      getallusersinlineresp = objectMapper.readValue("[{\"status\":\"success\"},{\"firstName\":\"Benjamin\",\"id\":\"0729d37c-ef9f-4ffa-8f71-a6eedf1f95b7\",\"lastName\":\"Smith\"}]", GetAllUsersInlineResp.class);
    } catch (JsonProcessingException jpe) {
      jpe.printStackTrace();
    }

    return Response.status(200).entity(getallusersinlineresp).build();                             
  }            }




    