package me.myself.i.javatask_webclient.second;

import org.springframework.web.reactive.function.client.WebClient;

public class WebClientService2 {
    private WebClient webClient = WebClient.create();

    public RickAndMortyCharacterListResponse2 getReallyAllCharacters(String url) {
        return webClient.get()
                .uri(url)
                .retrieve()
                .toEntity(RickAndMortyCharacterListResponse2.class)
                .block()
                .getBody();
    }
}
