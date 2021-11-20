package com.example.demo_sql.repositories;

import com.example.demo_sql.models.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer> {
    List<UserDTO> findByUserNameContaining(String name);

    @Query("select u from UserDTO u where u.userName like %:name%")
    List<UserDTO> findByMoreThanTenNotes();
/*
    @Query("select avg(u.userAge) from UserDTO u")
    Float calculateAverage();

    @Query("select u from UserDTO u where u.userAge > (select avg(u.userAge) from UserDTO u)")
    List<UserDTO> userAverage();

    @Query("select u.userName as userName, avg(u.userAge) as averageAge from UserDTO u group by u.userName")
    List<AverageGroup> getAverageGroup();

    @Query("select u.userName as userName, h.homeName as homeName, h.homeStreet as homeStreet from UserDTO u join u.homes h")
    List<JoinResponse> findByUserHome();

    @Query("select new com.example.demoHQL.model.JoinResponse2(u.userName , h.homeName , h.homeStreet) from UserDTO u join u.homes h ")
    List<JoinResponse2> findByUserHome2();*/

}
