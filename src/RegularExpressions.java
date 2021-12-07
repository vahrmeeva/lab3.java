import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Пользователь вводит с клавиатуры некоторую строку, содержащую дату.
//Проверить, является ли данная строчка датой в формате dd/mm/yyyy,
//начиная с 1900 года до 9999 года.
import java.util.Scanner;
public class RegularExpressions {
    public static void main(String[] arg) {
        System.out.println("Введите дату(начиная с 1900 года и до 9999):");
        Scanner k = new Scanner(System.in);
        String date = k.nextLine();
        System.out.println(date.matches("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:19|[2-9]\\d)\\d{2})$"));
    }
}
