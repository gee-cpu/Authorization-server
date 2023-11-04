package com.gonchaba.authorizationserver.repository;



import com.gonchaba.authorizationserver.entity.MapUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapUserRepository extends JpaRepository<MapUser, Long> {
    MapUser findByUserName(String userName);
}
