package patterns.Builder;

public class Builder {

    public static void main(String[] args) {
        Person personA = new Person.Builder()
                .setName("권석찬")
                .setEmail("seokchan.kwon@handys.co.kr")
                .setPhone("01036194147")
                .setmAge(20)
                .builder();

        System.out.println("Name = " + personA.getName());
        System.out.println("Email = " + personA.getEmail());
        System.out.println("Phone = " + personA.getPhone());
        System.out.println("Age = " + personA.getAge());

        System.out.println();

        Person personB = new Person.Builder()
                .setName("seokchan.kwon")
                .setEmail("chan3619@naver.com")
                .setPhone("01012345678")
                .setmAge(10)
                .builder();

        System.out.println("Name = " + personB.getName());
        System.out.println("Email = " + personB.getEmail());
        System.out.println("Phone = " + personB.getPhone());
        System.out.println("Age = " + personB.getAge());

    }
}
