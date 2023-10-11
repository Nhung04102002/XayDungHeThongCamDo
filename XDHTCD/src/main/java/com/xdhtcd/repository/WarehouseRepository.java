package com.xdhtcd.repository;

import com.xdhtcd.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
    @Query("select p from Warehouse p")
    List<Warehouse> findAllWarehouse();

    @Query("select p from Warehouse p where p.address like %?1% or p.name like %?1%")
    List<Warehouse> findWarehouseBy(String text);
}
