package org.springmvci.loja.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springmvci.loja.controllers.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses = { HomeController.class })
public class AppWebConfiguration {

}
