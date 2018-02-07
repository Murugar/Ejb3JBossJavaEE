package iqmsoft.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Service {

  public String sendMessage(final String name) {
    return "Hello from Java EE7 EJB3 , " + name + "!";
  }
}
