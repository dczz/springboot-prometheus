package com.example.springbootprometheus;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public TimedAspect timedAspect (MeterRegistry meterRegistry) {
    return new TimedAspect(meterRegistry);
  }

}
