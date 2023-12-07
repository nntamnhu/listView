package com.example.lab04;

public class MonHoc {
    public String TenHinh;
    public String MaHP;
    public String TenHP;
    public String TenGV;

    public MonHoc(String tenHinh, String maHP, String tenHP, String tenGV) {
        TenHinh = tenHinh;
        MaHP = maHP;
        TenHP = tenHP;
        TenGV = tenGV;
    }

    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String tenHinh) {
        TenHinh = tenHinh;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String maHP) {
        MaHP = maHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String tenHP) {
        TenHP = tenHP;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void setTenGV(String tenGV) {
        TenGV = tenGV;
    }
}
