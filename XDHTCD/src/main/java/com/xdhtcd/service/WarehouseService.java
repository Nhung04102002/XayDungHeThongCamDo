package com.xdhtcd.service;

import com.xdhtcd.model.Warehouse;
import com.xdhtcd.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getAllWarehouse(){
        return warehouseRepository.findAllWarehouse();
    }
}
