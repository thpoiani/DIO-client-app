package me.dio.infrastructure.rest;

import io.smallrye.mutiny.Uni;
import me.dio.api.dto.in.Election;
import me.dio.infrastructure.rest.client.ElectionManagement;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class RestElectionManagementService {
    private final ElectionManagement electionManagement;

    public RestElectionManagementService(@RestClient ElectionManagement electionManagement) {
        this.electionManagement = electionManagement;
    }

    public Uni<List<Election>> getElections() {
        return electionManagement.getElections();
    }
}
