package testyfuse;


import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/services")
@Service
public interface AppInfoSevice {

    @GET
    @Path("/wersja")
    @Produces(MediaType.TEXT_PLAIN)
    String wersja();

    @GET
    @Path("/name")
    @Produces(MediaType.TEXT_PLAIN)
    String name();



}


