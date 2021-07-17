package PhamTuanThao.model;

import java.util.Date;

public class Product {
private int id;
private String name;
private String address;
private String nsx;
private String hsd;

    public Product() {
    }

    public Product(int id, String name, String address, String nsx, String hsd) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nsx = nsx;
        this.hsd = hsd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getHsd() {
        return hsd;
    }

    public void setHsd(String hsd) {
        this.hsd = hsd;
    }
}
