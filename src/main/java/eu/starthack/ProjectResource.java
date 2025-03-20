package eu.starthack;

import eu.starthack.ai.VirginBot;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/projects")
public class ProjectResource {

    @Inject
    VirginBot virginBot;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(String userQuery) {
        return virginBot.chat(userQuery);
    }
}
