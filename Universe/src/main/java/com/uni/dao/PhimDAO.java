package com.uni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uni.entity.Phim;

public interface PhimDAO extends JpaRepository<Phim, Integer> {

}
