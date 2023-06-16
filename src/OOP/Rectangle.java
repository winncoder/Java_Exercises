package OOP;

import java.util.Scanner;

public class Rectangle {
    private int length, width, P, S;



    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getP() {
        return P;
    }

    public int getS() {
        return S;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setP(int p) {
        P = p;
    }

    public void setS(int s) {
        S = s;
    }

    Rectangle(int Length, int Width ){ //ham khoi tao(ham dung)
        length = Length;
        width = Width;

    }
    Rectangle() {}
    void input (){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextInt();
        System.out.print("Enter Width: ");
        width = sc.nextInt();
    }
    void chuvi (){
        P = (length+width)*2;
    }

    void dientich (){
        S= length * width;
    }
    void display(){
        System.out.printf("length: %d| wedth: %d\n", length, width);
        System.out.printf("Chu vi hinh chu nhat la: %d\n", P);
        System.out.printf("Dien tich hinh chu nhat la: %d\n", S);
    }
    public static void main(String[] args){
        Rectangle hcn1 = new Rectangle(20,10);
        Rectangle hcn2 = new Rectangle();
        hcn1.chuvi();
        hcn1.dientich();
        hcn1.display();
        hcn2.input();
        hcn2.chuvi();
        hcn2.dientich();
        hcn2.display();

    }
}
