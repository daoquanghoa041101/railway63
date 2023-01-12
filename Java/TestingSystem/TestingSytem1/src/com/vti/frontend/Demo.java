package com.vti.frontend;

public class Demo {
	public static void main(String[] args) {
		String[] nameRailway63s = new String[4];
		// Đưa phần tử vào trong mảng
		nameRailway63s[0] = "Chinh";
		nameRailway63s[1] = "Nam";
		nameRailway63s[2] = "Lan";
		nameRailway63s[3] = "Trường";

		// Lấy dữ liệu trong mảng để sử dụng
		System.out.println("Phần từ đang lưu trong mảng: ");
		System.out.println("Phần từ đầu tiên: " + nameRailway63s[0]);
		System.out.println("Phần từ tiếp theo : " + nameRailway63s[1]);
//cách 2
		String[] nameRailway64s = { "Chinh", "Nam", "Trường" };
		System.out.println("Phần tử 0: " + nameRailway64s[0]);
		System.out.println("Phần tử 0: " + nameRailway64s[1]);
		System.out.println("Phần tử 0: " + nameRailway64s[2]);

		int a = 1;
		System.out.println(a == 1 ? "Bạn vừa nhập vào số 1" : "Bạn vừa nhập vào số nào đấy");

	}
}