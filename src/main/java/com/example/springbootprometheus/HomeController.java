package com.example.springbootprometheus;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Timed(value = "home", description = "首页接口", histogram = true)
  @GetMapping("hello")
  public String hello () {
    return "hello world";
  }

}
