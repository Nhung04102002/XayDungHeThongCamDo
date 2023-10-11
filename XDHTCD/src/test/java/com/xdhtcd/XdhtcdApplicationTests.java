package com.xdhtcd;

import com.xdhtcd.model.Warehouse;
import com.xdhtcd.repository.WarehouseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

class XdhtcdApplicationTests {
    @Autowired
    private WarehouseRepository warehouseRepository;

    //Hiện tất cả thông tin kho
    @Test
    void testShowAll() {
        Iterable<Warehouse> warehouses = warehouseRepository.findAllWarehouse();
        assertAll(() -> {assertThat(warehouses).hasSizeGreaterThan(0);});
        for (Warehouse warehouse : warehouses){
            System.out.println(warehouse);
        }
    }

    //Tìm kiếm theo tên hoặc địa chỉ kho
    @Test
    public void testSearch(){
        String text = "Kho 2";
        List<Warehouse> warehouseList = warehouseRepository.findWarehouseBy(text);
        assertAll(() -> {assertThat(warehouseList).hasSizeGreaterThan(0);});
        for (Warehouse warehouse : warehouseList){
            System.out.println(warehouse);
        }
    }

}
