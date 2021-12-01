package com.Policyholder360API.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.Policyholder360API.impl.*;
import com.Policyholder360API.models.*;
import com.Policyholder360API.services.*;

import com.Policyholder360API.models.create.*;
@Path("create")
public class CreateResource {

  @Context
  private ServletConfig servletConfig;

  @Context
  private ServletContext servletContext;

  @Context
  private HttpServletRequest servletRequest;

  @Context
  private HttpServletResponse servletResponse;

  @Context
  private UriInfo uriInfo;

  private CreateService delegate;

  public CreateResource() {
    this.delegate = new CreateImplementation();
  }

  /**
   * Creates a new user in the system. The user will be assigned ...
   *
   * @param contentType 
   */
  @POST
  @Path("/")            
  @Consumes("application/x-www-form-urlencoded")                        
  @Produces("application/json; charset=utf-8, application/json")
  public Response NewUser(NewUserInlineReqUrlencoded newuserinlinerequrlencoded, 
@HeaderParam("Content-Type") String contentType
) {
    NewUserParams params = new NewUserParams();
    params.setContent-Type(contentType);

    return delegate.NewUser(params);
  }
}    