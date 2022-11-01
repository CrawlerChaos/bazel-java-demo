package com.oo.bazel.di;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.oo.bazel.impl.Audi;
import com.oo.bazel.impl.Benz;
import com.oo.bazel.service.ICar;

public class DIModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(ICar.class).to(Benz.class);
  }
}
