package com.xdhtcd.repository;

import com.xdhtcd.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    @Query("select p from Warehouse p")
    List<Warehouse> findAllWarehouse();
}
