package me.myself.i.javatask_webclient.first;

import me.myself.i.javatask_webclient.first.RickAndMortyCharacterListResponse;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientService {
    private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public RickAndMortyCharacterListResponse getAllCharacters() {
        RickAndMortyCharacterListResponse response = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyCharacterListResponse.class)
                .block()
                .getBody();
        return response;
    }
}
