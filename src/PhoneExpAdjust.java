import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExpAdjust {

    public static void main(String[] args) {
//        System.out.println(isPhone("18964975767"));wwwwww
        Map<String,String> map = new HashMap<>();
        map.put("name","yujianhui");
        map.put("age","22");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate dNow = LocalDate.now();
        System.out.println(dNow);
        LocalTime tNow = LocalTime.now();
        System.out.println(tNow);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(dtf.format(LocalDateTime.now()));
    }


    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            System.out.println("手机号应为11位数");
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if (!isMatch) {
                System.out.println("手机号格式不正确！");
            }
            return isMatch;
        }
    }


}
