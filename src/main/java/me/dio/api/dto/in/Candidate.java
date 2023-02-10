package me.dio.api.dto.in;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record Candidate(String id,
                        Optional<String> photo,
                        String fullName,
                        String email,
                        Optional<String> phone,
                        Optional<String> jobTitle,
                        Integer votes) {
}
