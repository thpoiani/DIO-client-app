package me.dio.api.dto.in;

import java.util.List;

public record Election(String id, List<Candidate> candidates) {
}
