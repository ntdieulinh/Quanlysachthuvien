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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap thong tin sach
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

        // bai 1: kiem tra tinh hop le cua sach
        System.out.println("\n BAI 1: KIEM TRA SACH ");

        if (donGia > 0 && soLuong >= 0
                && namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("Thong tin sach hop le!");
        } else {
            System.out.println("Thong tin sach khong hop le!");
        }

        // bai 2: phan loai gia sach
        System.out.println("\n BAI 2: PHAN LOAI GIA ");

        if (donGia <= 0) {
            System.out.println("Gia sach khong hop le!");
        } else if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        // bai 3: phan loai ton kho
        System.out.println("\n BAI 3: PHAN LOAI TON KHO ");

        if (soLuong < 0) {
            System.out.println("So luong khong hop le!");
        } else if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het sach");
        } else if (soLuong <= 20) {
            System.out.println("Con it sach");
        } else {
            System.out.println("Con nhieu sach");
        }

        // bai 4: chon loai sach bang switch
        System.out.println("\n BAI 4: LOAI SACH ");

        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap lua chon loai sach: ");
        int loaiSach = Integer.parseInt(sc.nextLine());

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }

        // Hien thi lai thong tin sach
        System.out.println("\n THONG TIN SACH ");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        sc.close();
    }
}
