package fpt.aptech.t2009m1helloworld.model;

import fpt.aptech.t2009m1helloworld.entity.User;

import java.util.List;

public interface AccountModel {
    boolean save(User user);

    boolean update(int id, User updatedUser);

    boolean delete(int id);

    User findById(int id);
    List<User> findAll();

}
