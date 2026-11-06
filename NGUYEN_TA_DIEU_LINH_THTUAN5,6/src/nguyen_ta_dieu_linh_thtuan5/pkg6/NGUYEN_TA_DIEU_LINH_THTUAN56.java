/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nguyen_ta_dieu_linh_thtuan5.pkg6;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class NGUYEN_TA_DIEU_LINH_THTUAN56 {

    /**
     * @param args the command line arguments
     */
     
    static Scanner sc = new Scanner(System.in);
    // Mảng lưu thông tin sách
    static String[] maSach;
    static String[] tenSach;
    static int[] soLuong;
    static double[] donGia;

    static int n;

    // Bài 1: Nhập n cuốn sách bằng vòng lặp
    public static void nhapSach() {
        System.out.print("Nhap so luong sach: ");
        n = sc.nextInt();
        sc.nextLine();

        maSach = new String[n];
        tenSach = new String[n];
        soLuong = new int[n];
        donGia = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            maSach[i] = sc.nextLine();

            System.out.print("Ten sach: ");
            tenSach[i] = sc.nextLine();

            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();

            System.out.print("Don gia: ");
            donGia[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    // Hiển thị danh sách sách
    public static void hienThiSach() {
        if (n == 0) {
            System.out.println("Chua co sach!");
            return;
        }

        System.out.println("\n----- DANH SACH SACH -----");

        for (int i = 0; i < n; i++) {
            System.out.println("\nMa sach: " + maSach[i]);
            System.out.println("Ten sach: " + tenSach[i]);
            System.out.println("So luong: " + soLuong[i]);
            System.out.println("Don gia: " + donGia[i]);
        }
    }

    // Bài 2: Tính tổng số lượng và tổng giá trị sách
    public static void tinhTong() {
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < n; i++) {
            tongSoLuong += soLuong[i];

            // Giá trị sách = số lượng * đơn giá
            tongGiaTri += soLuong[i] * donGia[i];
        }

        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }

    // Bài 4: Tìm sách theo mã
    public static void timSach() {
        sc.nextLine();

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < n; i++) {
            if (maSach[i].equalsIgnoreCase(ma)) {
                System.out.println("Tim thay sach!");
                System.out.println("Ma sach: " + maSach[i]);
                System.out.println("Ten sach: " + tenSach[i]);
                System.out.println("So luong: " + soLuong[i]);
                System.out.println("Don gia: " + donGia[i]);

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }

    // Bài 3: Menu lặp đến khi chọn thoát
    public static void main(String[] args) {

        int chon;

        do {
            System.out.println("\n----- QUAN LY THU VIEN -----");
            System.out.println("1. Nhap sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tinh tong so luong va gia tri");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhapSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    tinhTong();
                    break;

                case 4:
                    timSach();
                    break;

                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 5);
    }
}

