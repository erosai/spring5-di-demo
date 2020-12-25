package guru.springframework.controllers;

public class MyController {

    public String hello(){
        System.out.println("Hello");

        return "foo";
    }
}
