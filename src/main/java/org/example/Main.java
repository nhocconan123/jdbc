package org.example;

import org.example.controller.EmpDAO;
import org.example.model.Employees;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void menumain()
    {
        System.out.println("_____ Quan Ly Nhan Su _________");
        System.out.println("1. Them nhan Vien");
        System.out.println("2. Danh sach nhan vien");
        System.out.println("3. Tìm kiếm nhân viên theo tên");
        System.out.println("4. Cập nhật thông tin nhân viên");
        System.out.println("5. Xoá nhân viên theo mã");
    }

    private static void option1(Scanner in) {
        EmpDAO addEmp= new EmpDAO();
        Employees tmp = new Employees();
        System.out.print("Nhâp vào họ và tên:");
        tmp.setFullName(in.nextLine());
        System.out.println("nhap vao thành phố");
        tmp.setCity(in.nextLine());
        System.out.println("nhap vao so dien thoai");
        tmp.setPhone(in.nextLine());
        System.out.println("nhap vao gioi tinh");
        tmp.setGender(in.nextInt());
        System.out.println("nhap vao luong");
        tmp.setSalary(in.nextInt());
        System.out.println("nhap vao email");
        tmp.setEmail(in.nextLine());
        addEmp.insert(tmp);

        System.out.println("Lưu thành công");

    }
    private static void option2(){
        EmpDAO empDAO=new EmpDAO();
        List<Employees> list=empDAO.getEmp();
        System.out.println(list);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int option = -1;
        do {
            menumain();
            System.out.print("Nhập lựa chọn: ");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng!");
                continue;
            }
            if (option < 1 || option > 6) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }
            switch (option) {
                case 1:
                    option1(sc);
                    break;
                case 2: option2();
                    break;
            }
        }while(option != 6);
    }
}