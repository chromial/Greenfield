<<<<<<< HEAD

package org.jboss.as.quickstarts.rshelloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



@Path("/")
public class HelloWorld {
//    @Inject
//    HelloService helloService;

    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getHelloWorldJSON() {
        return "{\"result\":\"" + "Hello " + "World" + "!" + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({ "application/xml" })
    public String getHelloWorldXML() {
        return "<xml><result>" + "Hello " + "World" + "!" + "</result></xml>";
    }

}
=======

package org.jboss.as.quickstarts.rshelloworld;

import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("/")
public class HelloWorld {


    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getHelloWorldJSON() {
        return "{\"result\":\"" + "Hello " + "World" + "!" + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({ "application/xml" })
    public String getHelloWorldXML() {
        return "<xml><result>" + "Hello " + "World" + "!" + "</result></xml>";
    }

	@GET
	@Path("/autoqe")
	@Produces(MediaType.APPLICATION_JSON) 
	public String sendAutoQCRespose(
			   @DefaultValue("Y") @QueryParam("loadStatus") String loadStatus,
			   @DefaultValue("Default reason") @QueryParam("statusReason") String statusReason
			) {
	    HashMap<String, String> AutoQCMap = new HashMap<String, String>(); 
	    Date date = new Date();
		AutoQCMap.put("load_date", date.toString());
	    //String loadStatus = ""; 
		AutoQCMap.put("load_status", loadStatus);
	    //String statusReason = "";
		AutoQCMap.put("status_reason", statusReason);
	    boolean goodQC = false;
	    // posting to AutoQC if there is no doc type supported by SCORE
	    //ConfirmationXML confirmXML = new ConfirmationXML(AutoQCMap);
	    System.out.println("AUTOQC>>>Confirmation XML>>>" + "confirmXML.getXML()");
	    try {

	    } catch (Exception e) {
	        System.out.println("AUTOQC>>>EFSLoadMethod>>>Could not post AutoQC>>>" + e.getMessage());
	        e.printStackTrace();
	    }

	    String string = "{\"result\":\"" + "Hello " + goodQC + "!" + "\"}";
		return string;
	}

}
>>>>>>> 3adc217126b067c68e1223c39d0745e60df58074
