import java.util.TimerTask;

public class MyTimerTask extends TimerTask {


    private String name;
    private int during;

    public MyTimerTask(int during){
        this.during = during;
    }


    @Override
    public void run() {
        //打印当前name的内容
        System.out.println("我正在执行定时任务。执行周期："+during+" 秒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}