package com.example.entitymanagerdemo.repository;

import com.example.entitymanagerdemo.config.EntityManagerFactoryConfig;
import com.example.entitymanagerdemo.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  @PersistenceContext
  private final EntityManager entityManager = EntityManagerFactoryConfig.getEntityManager();

  public void save(User user) {
    System.out.println(entityManager);
    entityManager.getTransaction().begin();
    entityManager.persist(user);
    entityManager.getTransaction().commit();
    entityManager.close();
  }

}
