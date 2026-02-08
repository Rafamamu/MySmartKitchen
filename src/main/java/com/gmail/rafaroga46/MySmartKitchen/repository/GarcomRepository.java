package com.gmail.rafaroga46.MySmartKitchen.repository;

import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GarcomRepository extends JpaRepository<Garcom,Long> {


   boolean existsByLogin(String  login);


}
