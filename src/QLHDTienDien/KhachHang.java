package QLHDTienDien;

public abstract class KhachHang {
    //mã khách hàng, họ tên, tháng, số lượng (số KW tiêu thụ), đơn giá
    String id, name;
    int month, quality, price;
    public KhachHang (){}

    public KhachHang(String id, String name, int month, int quality, int price) {
        try {
            this.id = id;
            this.name = name;
            this.month = month;
            this.quality = quality;
            this.price = price;
        }
        catch (Exception e){
            System.out.println("Nhap thong tin khach hang sai" + e);
        }
    }

    void display()
    {
        System.out.print(id + "\t" + name + "\t" + month + "\t" + quality + "\t" + price + "\t");
    }

    void  Thang6(){
        if (month == 6)
        {
            display();
        }
    }

    abstract void phat();
    void  input(){}

}
