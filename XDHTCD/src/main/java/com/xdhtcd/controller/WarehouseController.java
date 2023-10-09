package com.xdhtcd.controller;

import com.xdhtcd.model.Warehouse;
import com.xdhtcd.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @GetMapping("/")
    public String showHomepage(){

        return "index";
    }

    @GetMapping("/warehouse")
    public String showWarehouse(Model model){
        List<Warehouse> warehouseList = warehouseService.getAllWarehouse();
        model.addAttribute("warehouseList", warehouseList);
        return "tables";
    }
}
