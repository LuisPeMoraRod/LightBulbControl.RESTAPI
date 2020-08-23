package com.jersey.lightbulbapi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
  
@Path("/ipaddress")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class JerseyService
{
	private static Object ipAddress;
    @GET
    public Response getIp()
    {
         return Response.status(Status.OK).entity(JerseyService.ipAddress).build();
    }
    
    @POST
    public Response setIp(String ipAddress) {
    	JerseyService.ipAddress = ipAddress;
    	return Response.status(Status.OK).entity("IP address setted successfully.").build();
    }
}
