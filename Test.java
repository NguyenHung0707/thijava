package Students;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add student records\n2. Display student records\n3. Save\n4. Exit");
        ControllerStudent ctt = new ControllerStudent();
        while (true){
            System.out.printf("Nhập lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    ctt.add();
                    break;
                case 2:
                    ctt.display();
                    break;
                case 3:
                    ctt.save();
                    break;
                case 4:
                    return;
            }
        }
    }
}