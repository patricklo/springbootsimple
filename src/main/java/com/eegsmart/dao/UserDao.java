package com.eegsmart.dao;

import com.eegsmart.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by patrick on 2015/9/21.
 */

@Repository
@Transactional
public class UserDao {

    public void create(User user){
        entityManager.persist(user);
        return;
    }

    public void del(User user){
        if(entityManager.contains(user)){
            entityManager.remove(user);
        }else{
            entityManager.remove(entityManager.merge(user));
        }
    }

    @SuppressWarnings("unchecked")
    public List getAll(){
        return entityManager.createQuery("from User").getResultList();
    }

    public User getByEmail(String email){
        return (User) entityManager.createQuery("form User where email = :email").setParameter("email",email).getSingleResult();
    }

    public User getById(long id){
        return entityManager.find(User.class,id);
    }

    public void update(User user){
        entityManager.merge(user);
        return;
    }
    @PersistenceContext
    private EntityManager entityManager;
}
