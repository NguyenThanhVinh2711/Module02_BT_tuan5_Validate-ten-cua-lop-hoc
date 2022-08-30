import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class validNameTest {


    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        int n = scanner.nextInt();
        validName validName = new validName();
        System.out.println("Nhập tên lớp học: ");
        for (int i = 0; i < n; i++) {
            String ar = scanner.next();
            arr.add(ar);
        }

        System.out.println("Check tên lớp học:");
        for (String name : arr) {
            boolean isValid = validName.checkRegex(name);
            System.out.println("Lớp " + name + " " + isValid);
        }
    }

}
