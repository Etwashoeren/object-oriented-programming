import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) throws FileNotFoundException {
      try{
          HashMap<String, String> info = new HashMap<>();
          Scanner scanner = new Scanner(new File("db.txt"));

          while(scanner.hasNext()){
              String line = scanner.next();
              String line2 = scanner.next();
              info.put(line, line2);
          }
          scanner.close();
          System.out.println(info);

          Scanner sc = new Scanner(System.in);

          do {
              System.out.println("id와 password를 입력해주세요.");
              System.out.print("id : ");
              String id = sc.nextLine().trim(); // 입력된 공백 제거

              if (info.containsKey(id)) {

                  System.out.print("password : ");
                  String pw = sc.nextLine().trim();

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

      }catch (Exception e) {e.printStackTrace();}
    }
}
