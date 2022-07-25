package me.myself.i.javatask_webclient.second;

import java.util.ArrayList;
import java.util.List;

public class Check2 {

    public static void main(String[] args) {

        WebClientService2 webClient = new WebClientService2();
        List<Character2> showList = new ArrayList<>();

        String url = "https://rickandmortyapi.com/api/character";
        RickAndMortyCharacterListResponse2 singlePage;

        do {

            singlePage = webClient.getOneCharacterPage(url);

            singlePage.results()
                    .stream()
                    .filter(e-> e.status().equals("Alive"))
                    .forEach(showList::add);

            url = singlePage.info().next();

        } while(url != null);

        showList.forEach(System.out::println);
    }
}
