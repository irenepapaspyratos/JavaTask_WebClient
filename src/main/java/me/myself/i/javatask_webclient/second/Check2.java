package me.myself.i.javatask_webclient.second;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Check2 {

    public static void main(String[] args) {

        WebClientService2 y = new WebClientService2();
        List<Character2> showList = new LinkedList<>();

        String url = "https://rickandmortyapi.com/api/character";
        Info2 infoList = y.getReallyAllCharacters(url).info();

        do {

            y.getReallyAllCharacters(url).results()
                    .stream()
                    .filter(e-> e.status().equals("Alive"))
                    .forEach(showList::add);

            url = infoList.next();
            infoList = y.getReallyAllCharacters(url).info();

        } while(infoList.next() != null);

        showList.forEach(System.out::println);
    }
}
