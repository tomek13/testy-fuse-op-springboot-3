package testyfuse;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("/info")
@Service
public interface AppInfoSevice {

    @GET
    @Path("/version")
    @Produces(MediaType.TEXT_PLAIN)
    String version();

    @GET
    @Path("/name")
    @Produces(MediaType.TEXT_PLAIN)
    String name();



}


