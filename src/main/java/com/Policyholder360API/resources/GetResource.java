package com.Policyholder360API.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.Policyholder360API.impl.*;
import com.Policyholder360API.models.*;
import com.Policyholder360API.services.*;

import com.Policyholder360API.models.get.*;
@Path("get")
public class GetResource {

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

  private GetService delegate;

  public GetResource() {
    this.delegate = new GetImplementation();
  }

  /**
   * Get all users in the system.
   *
   * @param all 
   */
  @GET
  @Path("/")
                        
  @Produces("application/json; charset=utf-8")
  public Response GetAllUsers(@QueryParam("all") boolean all
) {
    GetAllUsersParams params = new GetAllUsersParams();
    params.setAll(all);

    return delegate.GetAllUsers(params);
  }
}    