package QLHDTienDien;

import java.util.ArrayList;

public class QLTD {
    public static void main(String[] args){
        ArrayList<KhachHang> L = new ArrayList<>();
        KhachVN v1 = new KhachVN("VN01", "Thang", 6, 120, 1000, 100);
        L.add(v1);
        KhachVN v2 = new KhachVN("VN02", "Loc", 6, 200, 1000, 100);
        L.add(v2);
        KhachVN v3 = new KhachVN("VN03", "Nguyen", 4, 120, 1000, 100);
        L.add(v3);
        NuocNgoai v4  = new NuocNgoai("VN04", "Mosm", 6, 210, 1000, "Canada");
        L.add(v4);
        KhachVN v5 = new KhachVN();
        v5.input();
        NuocNgoai v6 = new NuocNgoai() ;
        v6.input();


        System.out.println("---- DANH SACH KHACH HANG ----");
        for (KhachHang khachHang:L)
            khachHang.display();
        v5.display();
        v6.display();
        System.out.println("---- DANH SACH KHACH HANG THANG 6 ----");
        for (KhachHang khachHang:L)
            khachHang.Thang6();
        v5.display();
        v6.display();
        System.out.println("---- DANH SACH KHACH HANG BI PHAT ----");
        for (KhachHang khachHang:L)
            khachHang.phat();
        v5.phat();
        v6.phat();
    }

}
