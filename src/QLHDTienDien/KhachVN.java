package QLHDTienDien;

import java.util.Scanner;

public class KhachVN extends KhachHang{
    int dinh_muc;
    KhachVN() {}

    public KhachVN(String id, String name, int month, int quality, int price, int dinh_muc) {
        super(id, name , month, quality, price);
        try {
            if (dinh_muc <0)
                throw new ArithmeticException("Dinh muc phai >0"); //nem loi ra catch
            else
                this.dinh_muc = dinh_muc;
        }
        catch (Exception e)
        {
            System.out.println("Loi ne may" + e);
        }
    }

    void display() {
        super.display();
        double bill;
        if (quality <= dinh_muc)
            bill = quality * price;
        else
            bill= dinh_muc * price + (quality - dinh_muc) * price * 2.5;
        System.out.print(dinh_muc + "\t" + bill + "\n");


    }

    void phat ()
    {
        if (quality > dinh_muc *1.5)
            display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id khach VN: ");
        id = sc.nextLine();
        System.out.print("Nhap ten khach VN: ");
        name = sc.nextLine();
        System.out.print("Nhap thang: ");
        month = sc.nextInt();
        System.out.print("Nhap so luong (so KW tieu thu): ");
        quality = sc.nextInt();
        System.out.print("Nhap don gia khach VN: ");
        price = sc.nextInt();
        System.out.print("Nhap dinh muc khach VN: ");
        dinh_muc = sc.nextInt();
        System.out.println("");

    }
}
