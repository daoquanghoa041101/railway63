package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.entity.Question;
import com.vti.entity.TypeName;
import com.vti.entity.TypeQuestion;

public class Program {
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Dev";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Marketing";

		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.PM;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.Dev;

		Position position3 = new Position();
		position1.id = 3;
		position1.name = PositionName.Test;

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nguyenvana123@gmail.com";
		account1.fullname = "Nguyen Van A";
		account1.username = "Van A";
		account1.department = department1;
		account1.position = position1;
		account1.creatDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "nguyenvana12365656@gmail.com";
		account2.fullname = "Nguyen Van C";
		account2.username = "VanC";
		account2.department = department2;
		account2.position = position2;
		account2.creatDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "nguyenvana12343@gmail.com";
		account3.fullname = "Nguyen Van B";
		account3.username = "Van B";
		account3.department = department3;
		account3.position = position3;
		account3.creatDate = LocalDate.now();

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Mentor";
		group1.creator = account1;
		group1.creaDate = LocalDate.now();
		Account[] groupAccounts1 = { account1, account2, account3 };
		group1.accounts = groupAccounts1;

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Tutor ";
		group2.creator = account2;
		group2.creaDate = LocalDate.now();
		Account[] groupAccounts2 = { account1, account2 };
		group2.accounts = groupAccounts2;

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Bảo vệ";
		group3.creator = account2;
		group3.creaDate = LocalDate.now();
		Account[] groupAccounts3 = { account1, account3 };
		group3.accounts = groupAccounts3;

		Group[] accountGroups1 = { group1, group2, group3 };
		account1.groups = accountGroups1;

		Group[] accountGroups2 = { group1, group2 };
		account2.groups = accountGroups2;

		Group[] accountGroups3 = { group1, group3 };
		account3.groups = accountGroups3;

		TypeQuestion type1 = new TypeQuestion();
		type1.id = 1;
		type1.name = TypeName.Essay;

		TypeQuestion type2 = new TypeQuestion();
		type2.id = 2;
		type2.name = TypeName.Multiple_Choice;

		TypeQuestion type3 = new TypeQuestion();
		type3.id = 3;
		type3.name = TypeName.Essay;

		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1;
		category1.name = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2;
		category2.name = "SQL";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.id = 3;
		category3.name = "Ruby";

		Question question1 = new Question();
		question1.id = 1;
		question1.content = "nội dung của câu hỏi1";
		question1.category = category1;
		question1.type = type1;
		question1.creator = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "nội dung của câu hỏi2";
		question2.category = category2;
		question2.type = type2;
		question2.creator = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "nội dung của câu hỏi3";
		question3.category = category1;
		question3.type = type3;
		question3.creator = account3;
		question3.createDate = LocalDate.now();

		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "nội dung của câu trả lời1";
		answer1.question = question1;
		answer1.isCorrect = false;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "nội dung của câu trả lời2";
		answer2.question = question2;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "nội dung của câu trả lời3";
		answer3.question = question3;
		answer3.isCorrect = true;

		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "mã đề thi 1";
		exam1.title = " tiêu đề của đề thi 1";
		exam1.category = category1;
		exam1.duration = "60 phut";
		exam1.creator = account1;
		exam1.createDate = LocalDate.now();
		Question[] questionexam1 = { question1, question2, question3 };
		exam1.questions = questionexam1;

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "mã đề thi2";
		exam2.title = " tiêu đề của đề thi 2";
		exam2.category = category2;
		exam2.duration = "60 phut";
		exam2.creator = account2;
		exam2.createDate = LocalDate.now();
		Question[] questionexam2 = { question2, question3 };
		exam2.questions = questionexam2;

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "mã đề thi 3";
		exam3.title = " tiêu đề của đề thi 3";
		exam3.category = category3;
		exam3.duration = "60 phut";
		exam3.creator = account3;
		exam3.createDate = LocalDate.now();
		Question[] questionexam3 = { question1, question3 };
		exam3.questions = questionexam3;

		Exam[] examquestion1 = { exam1, exam2, exam3 };
		question1.exams = examquestion1;
		Exam[] examquestion2 = { exam2, exam3 };
		question2.exams = examquestion2;
		Exam[] examquestion3 = { exam1, exam3 };
		question3.exams = examquestion3;

		System.out.println("Thông tin phòng ban 1: ,ID: " + department1.id + " Name: " + department1.name);
		System.out.println("Thông tin phòng ban 2: ,ID: " + department2.id + " Name: " + department2.name);
		System.out.println("Thông tin phòng ban 3: ,ID: " + department3.id + " Name: " + department3.name);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Thông tin Position1: ,ID: " + position1.id + " Name: " + position1.name);
		System.out.println("Thông tin Position2: ,ID: " + position2.id + " Name: " + position2.name);
		System.out.println("Thông tin Position3: ,ID: " + position3.id + " Name: " + position3.name);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Thông tin Account 1: ,ID: " + account1.id + " email: " + account1.email + " username: "
				+ account1.username + " fullname: " + account1.fullname + " Department: " + account1.department.name
				+ " Position: " + account1.position.name + " Group: " + account1.groups[0].name
				+ account1.groups[1].name + account1.groups[2].name + "Ngày: " + account1.creatDate);

		System.out.println("Thông tin Account 2: ,ID: " + account1.id + " email: " + account2.email + " username: "
				+ account2.username + " fullname: " + account2.fullname + " Department: " + account2.department.name
				+ " Position: " + account2.position.name + account2.groups[0].name + account2.groups[1].name + "Ngày: "
				+ account2.creatDate);

		System.out.println("Thông tin Account 3: ,ID: " + account1.id + " email: " + account3.email + " username: "
				+ account3.username + " fullname: " + account3.fullname + " Department: " + account3.department.name
				+ " Position: " + account3.position.name + account3.groups[0].name + account3.groups[1].name + "Ngày: "
				+ account3.creatDate);

		System.out.println("Thông tin Group1: ,Id: " + group1.id + " Name: " + group1.name + " Creator: "
				+ group1.creator.fullname + " Account: " + group1.accounts[0].fullname + group1.accounts[1].fullname
				+ group1.accounts[2].fullname + "Ngày: " + group1.creaDate);
		System.out.println("Thông tin Group2: ,Id: " + group2.id + " Name: " + group2.name + " Creator: "
				+ group2.creator.fullname + " Account: " + group2.accounts[0].fullname + group2.accounts[1].fullname
				+ "Ngày: " + group2.creaDate);
		System.out.println("Thông tin Group3: ,Id: " + group3.id + " Name: " + group3.name + " Creator: "
				+ group3.creator.fullname + " Account: " + group3.accounts[0].fullname + group3.accounts[1].fullname
				+ "Ngày: " + group3.creaDate);
		System.out.println("Thông tin Loại Câu hỏi 1: ,ID: " + type1.id + " Name: " + type1.name);
		System.out.println("Thông tin Loại Câu hỏi 2: ,ID: " + type2.id + " Name: " + type2.name);
		System.out.println("Thông tin Loại Câu hỏi 3: ,ID: " + type3.id + " Name: " + type3.name);

		System.out.println("Thông tin chủ đề câu hỏi 1 , ID: " + category1.id + " Name: " + category1.name);
		System.out.println("Thông tin chủ đề câu hỏi 2 , ID: " + category2.id + " Name: " + category2.name);
		System.out.println("Thông tin chủ đề câu hỏi 3 , ID: " + category3.id + " Name: " + category3.name);

		System.out.println("Thông tin câu hỏi 1: ,ID: " + question1.id + " Content: " + question1.content
				+ " CategoryQuestion: " + question1.category.name + " TypeQuestion: " + question1.type.name
				+ " Creator: " + question1.creator.fullname + " Exam: " + question1.exams[0].code
				+ question1.exams[1].code + question1.exams[2].code);
		System.out.println(
				"Thông tin câu hỏi 2: ,ID: " + question2.id + " Content: " + question2.content + " CategoryQuestion: "
						+ question2.category.name + " TypeQuestion: " + question2.type.name + " Creator: "
						+ question2.creator.fullname + " Exam: " + question2.exams[0].code + question2.exams[1].code);
		System.out.println(
				"Thông tin câu hỏi 3: ,ID: " + question3.id + " Content: " + question3.content + " CategoryQuestion: "
						+ question3.category.name + " TypeQuestion: " + question3.type.name + " Creator: "
						+ question3.creator.fullname + " Exam: " + question3.exams[0].code + question3.exams[1].code);

		System.out.println("Thông tin câu trả lời 1: ,ID: " + answer1.id + " Content: " + answer1.content + "Question: "
				+ answer1.question.content + " isCorrect: " + answer1.isCorrect);
		System.out.println("Thông tin câu trả lời 2: ,ID: " + answer2.id + " Content: " + answer2.content + "Question: "
				+ answer2.question.content + " isCorrect: " + answer2.isCorrect);
		System.out.println("Thông tin câu trả lời 3: ,ID: " + answer3.id + " Content: " + answer3.content + "Question: "
				+ answer3.question.content + " isCorrect: " + answer3.isCorrect);

		System.out.println("Thông tin đề thi 1: ,ID: " + exam1.id + " Code: " + exam1.code + " Title: " + exam1.title
				+ " CategoryQuestion: " + exam1.category.name + " duration: " + exam1.duration + " creator: "
				+ exam1.creator.fullname + " Question: " + exam1.questions[0].content + exam1.questions[1].content
				+ exam1.questions[2].content);
		System.out.println("Thông tin đề thi 2: ,ID: " + exam2.id + " Code: " + exam2.code + " Title: " + exam2.title
				+ " CategoryQuestion: " + exam2.category.name + " duration: " + exam2.duration + " creator: "
				+ exam2.creator.fullname + " Question: " + exam2.questions[0].content + exam2.questions[1].content);
		System.out.println("Thông tin đề thi 3: ,ID: " + exam3.id + " Code: " + exam3.code + " Title: " + exam3.title
				+ " CategoryQuestion: " + exam3.category.name + " duration: " + exam3.duration + " creator: "
				+ exam3.creator.fullname + " Question: " + exam3.questions[0].content + exam3.questions[1].content);

		System.out.println(
				"===================================================================================================================");

		System.out.println(
				"===================================TestingSystem2==================================================================");

//		Exercise 1 (Optional): Flow Control

		System.out.println(
				"===================================Question 1:==================================================================");

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là …" + account2.department.name);
		}

		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 2==================================================================");

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int countIntGroup2 = account2.groups.length;
			if (countIntGroup2 == 1 || countIntGroup2 == 2) {
				System.out.println("Group của nhân viên  này là Java Fresher, C# Fresher");
			} else if (countIntGroup2 == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			} else if (countIntGroup2 == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}

		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 3==================================================================");
//		Question 3
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là …" + account2.department.name);

		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 4==================================================================");
//		Question 4
		System.out.println(
				account1.position.name == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");

		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 5==================================================================");
//		Question 5

		if (group1.accounts == null) {
			System.out.println("Nhóm chưa có thành viên");
		} else {
			int countIntGroup1 = group1.accounts.length;
			switch (countIntGroup1) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 6==================================================================");
//		Question 6
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			int CountIntGroup6 = account2.groups.length;
			switch (CountIntGroup6) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
		}
		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 7==================================================================");
		switch (account1.position.name) {
		case Dev:
			System.out.println("Đây là Developer");
			break;

		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 8==================================================================");
		Account[] accounts = { account1, account2, account3 };
		for (Account account : accounts) {

			System.out.println(" Email: " + account.email + " Fullname: " + account.fullname + " DepartmentName: "
					+ account.department.name);
		}
		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 9==================================================================");

		Department[] departments = { department1, department2, department3 };
		for (Department department : departments) {
			System.out.println("Id: " + department.id + " Name: " + department.name);
		}
		System.out.println(
				"===================================================================================================================");
		System.out.println(
				"===================================Question 10==================================================================");
		Account[] accounts10 = { account1, account2, account3 };
		for (int i = 0; i < accounts10.length; i++) {
			System.out.println("Thông tin Account " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts10[i].email);
			System.out.println("Fullname: " + accounts10[i].fullname);
			System.out.println("Department: " + accounts10[i].department.name);
		}
		System.out.println(
				"===================================Question 12==================================================================");
		Department[] departments12 = { department1, department2, department3 };
		for (int i = 0; i < departments12.length; i++) {
			System.out.println("Thông tin Department " + (i + 1) + " là: ");
			System.out.println("ID: " + departments12[i].id);
			System.out.println("Name : " + departments12[i].name);
		}
		System.out.println(
				"===================================Question 11==================================================================");
		Department[] departments11 = { department1, department2, department3 };
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin Department " + (i + 1) + " là: ");
			System.out.println("ID: " + departments11[i].id);
			System.out.println("Name : " + departments11[i].name);
		}
		System.out.println(
				"===================================Question 13==================================================================");
		Account[] accounts13 = { account1, account2, account3 };
		for (int i = 0; i < accounts13.length; i++) {
			if (i != 1) {

				System.out.println("Thông tin Account " + (i + 1) + " là: ");
				System.out.println("Email: " + accounts13[i].email);
				System.out.println("Fullname: " + accounts13[i].fullname);
				System.out.println("Department: " + accounts13[i].department.name);
			}

		}

		System.out.println(
				"===================================Question 14==================================================================");
		Account[] accounts14 = { account1, account2, account3 };
		for (int i = 0; i < accounts14.length; i++) {
			if (accounts14[i].id < 4) {
				System.out.println("Thông tin Account " + (i + 1) + " là: ");
				System.out.println("Email: " + accounts14[i].email);
				System.out.println("Fullname: " + accounts14[i].fullname);
				System.out.println("Department: " + accounts14[i].department.name);
			}

		}
		System.out.println(
				"===================================Question 15==================================================================");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(
				"===================================Question 16-10==================================================================");
		Account[] accounts1610 = { account1, account2, account3 };
		int i = 0;
		while (i < accounts1610.length) {
			System.out.println("Thông tin Account " + (i + 1) + " là: ");
			System.out.println("Email: " + accounts1610[i].email);
			System.out.println("Fullname: " + accounts1610[i].fullname);
			System.out.println("Department: " + accounts1610[i].department.name);
			i++;
		}
		System.out.println(
				"===================================Question 16-11==================================================================");
		Department[] departments1611 = { department1, department2, department3 };
		int i11 = 0;
		while (i11 < departments1611.length) {
			System.out.println("Thông tin Department " + (i11 + 1) + " là: ");
			System.out.println("ID: " + departments1611[i11].id);
			System.out.println("Name : " + departments1611[i11].name);
			i11++;
		}
		System.out.println(
				"===================================Question 16-12==================================================================");
		Department[] departments1612 = { department1, department2, department3 };
		int i12 = 0;
		while (i12 < 2) {
			System.out.println("Thông tin Department " + (i12 + 1) + " là: ");
			System.out.println("ID: " + departments12[i12].id);
			System.out.println("Name : " + departments12[i12].name);
			i12++;
		}
		System.out.println(
				"===================================Question 16-13==================================================================");
		Account[] accounts1613 = { account1, account2, account3 };
		int i13 = 0;
		while (i13 < accounts1613.length) {
			if (i13 != 1) {
				System.out.println("Thông tin Account " + (i13 + 1) + " là: ");
				System.out.println("Email: " + accounts13[i13].email);
				System.out.println("Fullname: " + accounts13[i13].fullname);
				System.out.println("Department: " + accounts13[i13].department.name);

			}
			i13++;
		}
		System.out.println(
				"===================================Question 16-14==================================================================");
		Account[] accounts1614 = { account1, account2, account3 };
		int i14 = 0;
		while (i14 < accounts1614.length) {
			if (accounts1614[i14].id < 4) {
				System.out.println("Thông tin Account " + (i14 + 1) + " là: ");
				System.out.println("Email: " + accounts14[i14].email);
				System.out.println("Fullname: " + accounts14[i14].fullname);
				System.out.println("Department: " + accounts14[i14].department.name);
			}
			i14++;
		}
		System.out.println(
				"===================================Question 16-15==================================================================");
		int i15 = 0;
		while (i15 <= 20) {
			if (i15 % 2 == 0) {
				System.out.println(i15);
			}
			i15++;
		}
		System.out.println(
				"===================================Question 17-10==================================================================");
		Account[] accounts1710 = { account1, account2, account3 };
		int i16 = 0;
		do {
			System.out.println("Thông tin Account " + (i16 + 1) + " là: ");
			System.out.println("Email: " + accounts1610[i16].email);
			System.out.println("Fullname: " + accounts1610[i16].fullname);
			System.out.println("Department: " + accounts1610[i16].department.name);
			i16++;
		} while (i16 < accounts1610.length);
		System.out.println(
				"===================================Question17 11==================================================================");
		Department[] departments1711 = { department1, department2, department3 };
		int i17 = 0;
		do {
			System.out.println("Thông tin Department " + (i17 + 1) + " là: ");
			System.out.println("ID: " + departments1611[i17].id);
			System.out.println("Name : " + departments1611[i17].name);
			i17++;
		} while (i17 < departments1711.length);
		System.out.println(
				"===================================Question17 12==================================================================");
		Department[] departments1712 = { department1, department2, department3 };
		int i18 = 0;
		do {
			System.out.println("Thông tin Department " + (i18 + 1) + " là: ");
			System.out.println("ID: " + departments1712[i18].id);
			System.out.println("Name : " + departments1712[i18].name);
			i18++;
		} while (i18 < 2);
		System.out.println(
				"===================================Question 1713==================================================================");
		Account[] accounts1713 = { account1, account2, account3 };
		int i6 = 0;
		do {
			if (i6 != 1) {
				System.out.println("Thông tin Account " + (i6 + 1) + " là: ");
				System.out.println("Email: " + accounts13[i6].email);
				System.out.println("Fullname: " + accounts13[i6].fullname);
				System.out.println("Department: " + accounts13[i6].department.name);

			}
			i6++;
		} while (i6 < accounts1713.length);
		System.out.println(
				"===================================Question 1714==================================================================");
		Account[] accounts1714 = { account1, account2, account3 };
		int i7 = 0;
		do {
			if (accounts1714[i7].id < 4) {
				System.out.println("Thông tin Account " + (i7 + 1) + " là: ");
				System.out.println("Email: " + accounts14[i7].email);
				System.out.println("Fullname: " + accounts14[i7].fullname);
				System.out.println("Department: " + accounts14[i7].department.name);
			}
			i7++;
		} while (i7 < accounts1714.length);
		System.out.println(
				"===================================Question17 15==================================================================");
		int i8 = 0;
		do {
			if (i8 % 2 == 0) {
				System.out.println(i8);
			}
			i8++;
		} while (i8 <= 20);

//		Exercise 2 (Optional): System out printf
		System.out.println(
				"=====================================Exercise 2 (Optional): System out printf==============================================================================");
		System.out.println(
				"===================================Question 1==================================================================");
		int i9 = 5;
		System.out.printf("%d%n", i9);
		System.out.println(
				"===================================Question 11==================================================================");

		System.out.println(
				"===================================Question 11==================================================================");
	}

}
