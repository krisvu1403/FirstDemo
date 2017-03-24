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
public class BaiTap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhVe hcn1 = new HinhChuNhat("Hinh chu nhat", 45, 50);
        HinhVe hcn2 = new HinhChuNhat("Hinh chu nhat", 40, 45);
        HinhVe hv = new HinhVuong("Hinh vuong", 25);
        HinhVe ht1 = new HinhTron("Hinh tron", 55);
        HinhVe ht2 = new HinhTron("Hinh Tron", 30);
        
        DanhSachHinhVe ds = new DanhSachHinhVe();
        ds.themHinhVe(hcn1);
        ds.themHinhVe(hcn2);
        ds.themHinhVe(hv);
        ds.themHinhVe(ht1);
        ds.themHinhVe(ht2);
        
        
        System.out.println("===DANH SACH HINH VE===");
        ds.hienThiDanhSachHinhVe();
        
        
        System.out.println("===DANH SACH HINH VE SAU SAP XEP===");
        ds.sapXepDanhSachHinhVe();
        ds.hienThiDanhSachHinhVe();
    }
    
}
