package me.dio.api.dto.in;

import java.util.Optional;

public record Candidate(String id,
                        Optional<String> photo,
                        String fullName,
                        String email,
                        Optional<String> phone,
                        Optional<String> jobTitle,
                        Integer votes) {
}
