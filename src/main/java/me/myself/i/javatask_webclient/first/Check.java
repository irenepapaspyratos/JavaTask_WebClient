package me.myself.i.javatask_webclient.first;

import java.util.List;

public class Check {
    public static void main(String[] args) {

        WebClientService x = new WebClientService();
        List<Character> showList;

        showList = x.getAllCharacters().results();
        showList.stream().filter(e-> e.status().equals("Alive")).forEach(System.out::println);
    }
}
