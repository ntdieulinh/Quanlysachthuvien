/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.thuc.hanh.tuan.pkg3;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class BaiThucHanhTuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // bai 1: nhap thong tin sach
        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        // bai 2: tinh thanh tien
        double thanhTien = donGia * soLuong;

        // bai3: tinh phi van chuyen
        double phiVanChuyen = thanhTien * 5 / 100;

        // bai4: tinh tong tien nhap
        double tongTien = thanhTien + phiVanChuyen;

        // hien thi thong tin sach
        System.out.println("\nTHONG TIN SACH");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        System.out.println("\nKET QUA");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTien);

        sc.close();
    }
}


 