package me.dio.infrastructure.resources;

import io.smallrye.mutiny.Multi;
import me.dio.api.dto.in.Election;
import me.dio.infrastructure.rest.RestElectionManagementService;
import org.jboss.resteasy.reactive.RestStreamElementType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.time.Duration;
import java.util.List;

@Path("/election-results")
public class ElectionResultsResource {
    private final RestElectionManagementService electionManagementService;

    public ElectionResultsResource(RestElectionManagementService electionManagementService) {
        this.electionManagementService = electionManagementService;
    }

    @GET
    @RestStreamElementType(MediaType.APPLICATION_JSON)
    public Multi<List<Election>> results() {
        return Multi.createFrom()
                .ticks()
                .every(Duration.ofSeconds(10))
                .onItem()
                .transformToMultiAndMerge(n -> electionManagementService.getElections().toMulti());
   }
}
