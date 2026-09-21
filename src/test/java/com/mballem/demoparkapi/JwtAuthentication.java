package com.mballem.demoparkapi;

import com.mballem.demoparkapi.jwt.JwtToken;
import com.mballem.demoparkapi.web.dto.UsuarioLoginDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.client.RestTestClient;

import java.util.function.Consumer;

public class JwtAuthentication {

    public static Consumer<HttpHeaders> getHeaderAuthorization(RestTestClient client, String username, String password) {
        String token = client
                .post()
                .uri("/api/v1/auth")
                .body(new UsuarioLoginDTO(username, password))
                .exchange()
                .expectStatus().isOk()
                .expectBody(JwtToken.class)
                .returnResult().getResponseBody().getToken();

        return httpHeaders -> httpHeaders.add(HttpHeaders.AUTHORIZATION, "Bearer " + token);
    }
}
