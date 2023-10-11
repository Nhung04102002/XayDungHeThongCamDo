package com.xdhtcd.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouseID")
    private long warehouseID;
    @Column(name = "name", nullable = false, columnDefinition = "nvarchar(300)")
    private String name;
    @Column(name = "address", nullable = false, columnDefinition = "nvarchar(300)")
    private String address;
    @Column(name = "status", nullable = false)
    private boolean status = true;

    public Warehouse() {
    }

    public Warehouse(long warehouseID, String name, String address, boolean status) {
        this.warehouseID = warehouseID;
        this.name = name;
        this.address = address;
        this.status = status;
    }


    public long getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(long warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseID=" + warehouseID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
