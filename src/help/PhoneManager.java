package help;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneManager {

    private ArrayList<Phone> mPhones;

    public PhoneManager() {
        mPhones = new ArrayList<>();
    }

    public void addPhone(Scanner scanner) {
        if (scanner == null) {
            return;
        }
        while (true) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");

            String name = scanner.next();
            String tel = scanner.nextLine().trim();

            if (name != null && name.length() > 0 &&
                    tel != null && tel.length() > 0) {

                Phone phone = new Phone(name, tel);
                addPhone(phone);

                break;
            }
        }
    }

    public void addPhone(Phone phone) {
        if (phone == null) {
            return;
        }
        mPhones.add(phone);
    }

    public void read() {
        for (Phone phone : mPhones) {
            System.out.println(phone.getName() + "의 번호는 " + phone.getTel() + "입니다.");
        }
    }

    public String search(String name) {
        for (Phone phone : mPhones) {
            if (phone.getName().equals(name)) {
                System.out.println(phone.getName() + "의 번호는 " + phone.getTel() + "입니다.");
                return phone.getTel();
            }
        }
        System.out.println(name + "이(가) 없습니다.");
        return null;
    }

    public void run() {
        throw new NullPointerException("아몰랑");
    }

}
