package QLHDTienDien;

import java.util.Scanner;

public class NuocNgoai extends KhachHang {
    String country;

    NuocNgoai(){}
    public NuocNgoai(String id, String name, int month, int quality, int price, String country) {
        super(id, name , month, quality, price);
        try {
            this.country = country;
        }
        catch (Exception e)
        {
            System.out.println("Loi ne may" + e);
        }

    }

    void display() {
        super.display();
        double bill;
        bill = quality * price;
        System.out.print(country+ "\t" + bill + "\n");
    }

    void phat ()
    {
        if (quality > 200)
            display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id khach nuoc ngoai: ");
        id = sc.nextLine();
        System.out.print("Nhap ten khach nuoc ngoai: ");
        name = sc.nextLine();
        System.out.print("Nhap quoc tich: ");
        country = sc.nextLine();
        System.out.print("Nhap thang: ");
        month = sc.nextInt();
        System.out.print("Nhap so luong (so KW tieu thu): ");
        quality = sc.nextInt();
        System.out.print("Nhap don gia nuoc ngoai: ");
        price = sc.nextInt();


    }

}
