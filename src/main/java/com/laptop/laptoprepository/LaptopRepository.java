package com.laptop.laptoprepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.laptopdetails.LaptopDetails;

public interface LaptopRepository extends JpaRepository<LaptopDetails, Integer> {

}
