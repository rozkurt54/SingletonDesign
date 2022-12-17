package org.example;

import org.example.service.SingletonService;

public class Main {
  public static void main(String[] args) {

    SingletonService singletonService = SingletonService.getInstance();

    SingletonService singletonService1 = SingletonService.getInstance();

    System.out.println(singletonService == singletonService1); // expected true


    singletonService.setName("BMW");

    System.out.println(singletonService.getName()); // expected BMW  / printed singletonService::getName

    singletonService1.setName("MERCEDES");  // singletonService1::setName

    System.out.println(singletonService.getName()); // expected "Mercedes" BMW  / printed singletonService::getName

    System.out.println(singletonService.hashCode()); //expected singletonService1::hashCode == singletonService1::hashCode
    System.out.println(singletonService1.hashCode());


  }
}