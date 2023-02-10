package me.dio.infrastructure.rest.client;

import io.smallrye.mutiny.Uni;
import me.dio.api.dto.in.Election;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey="election-management")
public interface ElectionManagement {

    @GET
    @Path("/elections")
    Uni<List<Election>> getElections();
}
