package gabriel.joao.Projfinal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: Gabriel y João Pedro
 * @version: 0.4
 * @data: 2/5/2020.
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWordCntroller {
    @GetMapping("/")
    public String index() {
        return "Seja Bem Vindo ao Sistema!";
    }
}
