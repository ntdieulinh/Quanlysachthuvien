/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nguyen_ta_dieu_linh_thtuan5.pkg6;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class NGUYEN_TA_DIEU_LINH_THTUAN56 {

    /**
     * @param args the command line arguments
     */
     
     static Scanner sc = new Scanner(System.in);

    // Danh sach luu thong tin sach
    static ArrayList<String> danhSachSach = new ArrayList<>();

    // Bai 1: Tao mang so luong cua 5 cuon sach
    public static void bai1() {
        int[] soLuong = new int[5];

        int tong = 0;
        int lonNhat = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();

            tong += soLuong[i];

            if (i == 0 || soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("\nSo luong 5 cuon sach:");

        for (int i = 0; i < 5; i++) {
            System.out.println(soLuong[i]);
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }

    // Bai 2: Su dung ArrayList de luu ma sach
    public static void bai2() {
        ArrayList<String> maSach = new ArrayList<>();

        maSach.add("S01");
        maSach.add("S02");
        maSach.add("S03");

        System.out.println("Danh sach ma sach: " + maSach);

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        if (maSach.contains(ma)) {
            System.out.println("Tim thay ma sach!");
        } else {
            System.out.println("Khong tim thay ma sach!");
        }

        System.out.print("Nhap ma sach can xoa: ");
        String maXoa = sc.nextLine();

        if (maSach.remove(maXoa)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Ma sach khong ton tai!");
        }

        System.out.println("Danh sach sau khi xoa: " + maSach);
    }

    // Bai 3: Them sach
    public static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        // Kiem tra ma sach da ton tai
        if (timViTri(ma) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int sl = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double gia = sc.nextDouble();
        sc.nextLine();

        String sach = ma + "|" + ten + "|" + sl + "|" + gia;

        danhSachSach.add(sach);

        System.out.println("Them sach thanh cong!");
    }

    // Hien thi danh sach sach
    public static void hienThiSach() {
        if (danhSachSach.size() == 0) {
            System.out.println("Danh sach sach rong!");
            return;
        }

        System.out.println("\n----- DANH SACH SACH -----");

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] sach = danhSachSach.get(i).split("\\|");

            System.out.println("\nSach thu " + (i + 1));
            System.out.println("Ma sach: " + sach[0]);
            System.out.println("Ten sach: " + sach[1]);
            System.out.println("So luong: " + sach[2]);
            System.out.println("Don gia: " + sach[3]);
        }
    }

    // Tim vi tri sach theo ma
    public static int timViTri(String ma) {

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] sach = danhSachSach.get(i).split("\\|");

            if (sach[0].equalsIgnoreCase(ma)) {
                return i;
            }
        }

        return -1;
    }

    // Tim sach theo ma
    public static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {
            String[] sach = danhSachSach.get(viTri).split("\\|");

            System.out.println("Tim thay sach!");
            System.out.println("Ma sach: " + sach[0]);
            System.out.println("Ten sach: " + sach[1]);
            System.out.println("So luong: " + sach[2]);
            System.out.println("Don gia: " + sach[3]);

        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    // Xoa sach theo ma
    public static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {
            danhSachSach.remove(viTri);
            System.out.println("Xoa sach thanh cong!");
        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    // Sua thong tin sach
    public static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {

            String[] sach = danhSachSach.get(viTri).split("\\|");

            System.out.print("Nhap ten sach moi: ");
            String ten = sc.nextLine();

            System.out.print("Nhap so luong moi: ");
            int sl = sc.nextInt();

            System.out.print("Nhap don gia moi: ");
            double gia = sc.nextDouble();
            sc.nextLine();

            String sachMoi = sach[0] + "|" + ten + "|" + sl + "|" + gia;

            danhSachSach.set(viTri, sachMoi);

            System.out.println("Sua sach thanh cong!");

        } else {
            System.out.println("Khong tim thay sach!");
        }
    }

    // Bai 4: Tinh tong so luong sach
    public static void tinhTongSoLuong() {
        int tong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] sach = danhSachSach.get(i).split("\\|");

            tong += Integer.parseInt(sach[2]);
        }

        System.out.println("Tong so luong sach: " + tong);
    }

    // Tinh tong gia tri sach
    public static void tinhTongGiaTri() {
        double tong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {

            String[] sach = danhSachSach.get(i).split("\\|");

            int sl = Integer.parseInt(sach[2]);
            double gia = Double.parseDouble(sach[3]);

            tong += sl * gia;
        }

        System.out.println("Tong gia tri sach: " + tong);
    }

    // Menu chinh
    public static void main(String[] args) {

        int chon;

        do {
            System.out.println("\n----- QUAN LY THU VIEN -----");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themSach();
                    break;

                case 2:
                    hienThiSach();
                    break;

                case 3:
                    timSach();
                    break;

                case 4:
                    xoaSach();
                    break;

                case 5:
                    suaSach();
                    break;

                case 6:
                    tinhTongSoLuong();
                    break;

                case 7:
                    tinhTongGiaTri();
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);
    }
}

