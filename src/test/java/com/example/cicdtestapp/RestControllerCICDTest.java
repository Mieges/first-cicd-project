package com.example.cicdtestapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(RestControllerCICD.class)
class RestControllerCICDTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloReturnsExpectedResponse() throws Exception {
        var result = mockMvc.perform(get("/hello")).andReturn();

        assertThat(result.getResponse().getStatus()).isEqualTo(200);
        assertThat(result.getResponse().getContentAsString()).isEqualTo("Hello CI/CD");
    }
}