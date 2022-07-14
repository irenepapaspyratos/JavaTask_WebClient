package me.myself.i.javatask_webclient;

import me.myself.i.javatask_webclient.first.WebClientService;
import org.junit.jupiter.api.Test;

class WebClientServiceTest {

    @Test
    void getAllCharacters() {
        WebClientService x = new WebClientService();
        System.out.println(x.getAllCharacters());

    }
}