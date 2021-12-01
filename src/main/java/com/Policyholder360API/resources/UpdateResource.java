package com.Policyholder360API.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.Policyholder360API.impl.*;
import com.Policyholder360API.models.*;
import com.Policyholder360API.services.*;

import com.Policyholder360API.models.update.*;
@Path("update")
public class UpdateResource {

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

  private UpdateService delegate;

  public UpdateResource() {
    this.delegate = new UpdateImplementation();
  }

  /**
   * Send the keys that you&apos;d like to update, this can be one or ...
   *
   * @param contentType 
   * @param id The user&apos;s ID (required)
   */
  @PUT
  @Path("/")            
  @Consumes("application/x-www-form-urlencoded")                        
  @Produces("application/json; charset=utf-8")
  public Response UpdateUser(UpdateUserInlineReqUrlencoded updateuserinlinerequrlencoded, 
@HeaderParam("Content-Type") String contentType, @QueryParam("id") String id
) {
    UpdateUserParams params = new UpdateUserParams();
    params.setContent-Type(contentType);
    params.setId(id);

    return delegate.UpdateUser(params);
  }
}    