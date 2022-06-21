package com.example.entitymanagerdemo.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerFactoryConfig {

  private static final EntityManagerFactory emf = Persistence
      .createEntityManagerFactory("entity-manager-unit");


  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

}
