import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String ifade = scan.nextLine();
        palindomeWithStringBuilder(ifade);
        palindromeWithForLoop(ifade);
    }

    private static void palindromeWithForLoop(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
        }
        System.out.println("tersStr = " + tersStr);
        if (tersStr.equalsIgnoreCase(str)) {
            System.out.print("girilen ifade palindomdur -> " + tersStr);
        } else System.out.print("girilen ifade palindrom degildir ->" + tersStr);
    }

    private static void palindomeWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String tersStr = sb.reverse().toString();

        if (tersStr.equalsIgnoreCase(str)) {
            System.out.println("girilen ifade palindomdur -> " + tersStr);
        } else System.out.println("girilen ifade palindrom degildir ->" + tersStr);

    }

}


