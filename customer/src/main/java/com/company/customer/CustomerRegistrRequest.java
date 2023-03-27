package com.company.customer;

public record CustomerRegistrRequest(
        String firstName,
        String lastName,
        String email) {
}
