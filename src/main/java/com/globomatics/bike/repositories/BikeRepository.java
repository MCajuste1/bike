package com.globomatics.bike.repositories;

import com.globomatics.bike.models.Bike;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {



}
