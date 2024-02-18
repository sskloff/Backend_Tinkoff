package edu.java.bot.models;

import lombok.Getter;

@Getter
public enum SupportedServices {
    GITHUB("github.com"),
    STACK_OVERFLOW("stackoverflow.com");

    private String domain;

    SupportedServices(String domain) {
    }
}
