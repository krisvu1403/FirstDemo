/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap10;

/**
 *
 * @author admin
 */
public abstract class HinhVe {
    private String tenHinh;
    
    public HinhVe(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
    
    public void hienThi() {
        String kq = "%s: diện tích : %.2f; chu vi: %.2f\n";
        System.out.printf(kq, this.getTenHinh(), this.tinhDienTich(), this.tinhChuVi());
    }

    /**
     * @return the tenHinh
     */
    public String getTenHinh() {
        return tenHinh;
    }

    /**
     * @param tenHinh the tenHinh to set
     */
    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
	//NEW LINE
	123
}
