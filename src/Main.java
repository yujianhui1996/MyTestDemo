import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Main {

        public static void main(String[] args) {
            Long during = 1000L;
            //创建定时器
            Timer timer = new Timer();
            //创建定时任务
            MyTimerTask myTimerTask = new MyTimerTask(during.intValue());
            //t通过timer定时定频率调用myTimerTask的业务逻辑
            //当前时间的2秒钟之后每隔一秒钟执行一次
            Date date = new Date(System.currentTimeMillis());
            timer.schedule(myTimerTask, date, during);
    }

}
