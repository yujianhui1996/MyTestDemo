public class threadDemo1 {
    public static void main(String args[]) throws InterruptedException{
        threadDemo1 synTest = new threadDemo1();
        synTest.test();
    }

    public void test() throws InterruptedException{
        new SynThread1().start();
        new SynThread1().start();
    }

    public void syn(String userName) throws Exception {
        synchronized(userName) {
            System.out.println("进入到同步块，userName=" + userName);
            Thread.sleep(2000);  //5秒
            System.out.println("退出同步块，userName=" + userName);
        }
    }

    class SynThread1 extends Thread {
        public void run(){
            try {
                syn("YuJianHui");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}