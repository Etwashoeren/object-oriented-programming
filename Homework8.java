import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        HashMap<String, String> info = new HashMap<>();
        info.put("myId", "myPass");
        info.put("myId2", "myPass2");
        info.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = scanner.nextLine().trim(); // 입력된 공백 제거

            if (info.containsKey(id)) {

                System.out.print("password : ");
                String pw = scanner.nextLine().trim();

                if (pw.equals(info.get(id))) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        } while (true);

    }
}
