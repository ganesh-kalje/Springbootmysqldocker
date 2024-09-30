package com.Springbootmysqldocker.Springbootmysqldocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Springbootmysqldocker.Springbootmysqldocker.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{

}
