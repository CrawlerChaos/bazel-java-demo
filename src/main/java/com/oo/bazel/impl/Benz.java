package com.oo.bazel.impl;

import com.google.inject.Singleton;
import com.oo.bazel.service.ICar;

@Singleton
public class Benz implements ICar {
  @Override
  public String name() {
    return "benz";
  }

  @Override
  public int speed() {
    return 20;
  }
}
