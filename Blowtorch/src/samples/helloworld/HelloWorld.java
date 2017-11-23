package samples.helloworld;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 
// Specifies the path to the RESTful service
@Path("/helloworld")
public class HelloWorld {
 
   // Specifies that the method processes HTTP GET requests 
   @GET
   //@Path("sayHello")  
   @Produces("text/plain")
   public String sayHello() {
      return "Hello World!";
   }
}