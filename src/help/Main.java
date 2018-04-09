package help;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원 수 >>");

        PhoneManager phoneManager = new PhoneManager();

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            phoneManager.addPhone(scanner);
        }

        System.out.println("저장되었습니다...");

        phoneManager.read();

        while(true) {
            System.out.print("검색할 이름 >>");

            String search = scanner.next();
            if (search != null && search.equals("exit")) {
                break;
            }
            phoneManager.search(search);
        }
    }

}
