package com.oo.bazel;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.oo.bazel.di.DIModule;
import com.oo.bazel.service.ICar;

public class Application {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new DIModule());
    ICar car = injector.getInstance(ICar.class);
    System.out.println("car:" + car.name() + "\n" + "speed:" + car.speed());
  }
}