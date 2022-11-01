package com.oo.bazel.impl;

import javax.inject.Singleton;

import com.oo.bazel.service.ICar;

@Singleton
public class Audi implements ICar {
  @Override
  public String name() {
    return "Audi";
  }

  @Override
  public int speed() {
    return 10;
  }
}
