package com.mab.example.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{first}/{last}")
	public Response getMsg(@PathParam("first") String fi, @PathParam("last") String la) {
 
		String output = "Hello there : " + fi + " " + la;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/{first}")
	public Response getMsgA(@PathParam("first") String fi) {
 
		return getMsg(fi, "");
 
	}
 
}