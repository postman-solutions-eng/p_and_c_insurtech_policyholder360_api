package com.Policyholder360API.impl;


import javax.ws.rs.core.Response;
import com.Policyholder360API.models.*;
import com.Policyholder360API.resources.CreateResource;
import com.Policyholder360API.services.CreateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.Policyholder360API.models.create.*;
public class CreateImplementation implements CreateService {
// Implement your logic here

    
  /**
   * Creates a new user in the system. The user will be assigned ...
   *
   * @param contentType 
   */
  @Override
  public Response NewUser(NewUserParams params) {
    // Your code here


    //create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    Newuser newuser = null;

    try {
      //convert json string to object
      newuser = objectMapper.readValue("{\"firstName\":\"Ben\",\"id\":\"0729d37c-ef9f-4ffa-8f71-a6eedf1f95b7\",\"lastName\":\"Smith\",\"status\":\"success\"}", Newuser.class);
    } catch (JsonProcessingException jpe) {
      jpe.printStackTrace();
    }

    return Response.status(200).entity(newuser).build();                             
  }                }




    