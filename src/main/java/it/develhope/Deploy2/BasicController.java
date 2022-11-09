package it.develhope.Deploy2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping
public class BasicController {

    public int sum(){
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int sum = a+b;
        return sum;
    }
}
