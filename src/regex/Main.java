package regex;

public class Main {

    public static void main(String[] args) {

        Regex regex = new Regex();

        System.out.println("checkEmail = " + regex.checkEmail("seokchan@google.com"));    // true
        System.out.println("checkEmail = " + regex.checkEmail("seokchan.kwon@google.com"));  // true
        System.out.println("checkEmail = " + regex.checkEmail("seokchan@google.test"));      // false
        System.out.println("checkEmail = " + regex.checkEmail("seokchan@google.co.kr"));     // true
        System.out.println("checkEmail = " + regex.checkEmail("seokchan@google.net"));       // true
        System.out.println("checkEmail = " + regex.checkEmail("seokchan@googlenet"));        // false


        System.out.println("\n\n");


        System.out.println("checkPhone = " + regex.checkPhone("01036194147"));   // true
        System.out.println("checkPhone = " + regex.checkPhone("02036194147"));   // false
        System.out.println("checkPhone = " + regex.checkPhone("0193614147"));    // true
        System.out.println("checkPhone = " + regex.checkPhone("019361414"));     // false
        System.out.println("checkPhone = " + regex.checkPhone("019361941471"));  // false
        System.out.println("checkPhone = " + regex.checkPhone("01936t194147"));  // false


        System.out.println("\n\n");
        System.out.println("checkPassword = " + regex.checkPassword("test"));  // false
        System.out.println("checkPassword = " + regex.checkPassword("testtttt"));  // false
        System.out.println("checkPassword = " + regex.checkPassword("test1234"));  // false

    }


}