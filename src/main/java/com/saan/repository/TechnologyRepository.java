package com.saan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saan.model.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

}
