package org.example.service;

public class SingletonService {

  private String name;

  private static SingletonService instance;

  private SingletonService(){}

  public static SingletonService getInstance() {
    if(instance == null) {
      instance = new SingletonService();
    }
    return instance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
