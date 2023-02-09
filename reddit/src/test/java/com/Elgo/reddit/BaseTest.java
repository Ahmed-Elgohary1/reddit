package com.Elgo.reddit;


import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class BaseTest {

    @Container
    static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:12")
            .withUsername("postgres")
            .withPassword("password")
            .withDatabaseName("reddit")
            .withReuse(true);
    static {
        postgreSQLContainer.start();
    }
}
