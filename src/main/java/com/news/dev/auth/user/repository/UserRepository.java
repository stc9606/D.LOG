package com.news.dev.auth.user.repository;

import com.news.dev.auth.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUserNo(String userNo);
    UserEntity findByEmail(String email);


}