package com.gmail.rafaroga46.MySmartKitchen.repository;

import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarcomRepository extends JpaRepository<Garcom,Long> {


}
