public class digui {

    public static void main(String[] args) {

        System.out.println("阶乘（递归算法）： " + factorial(3));
        System.out.println("斐波那契数列：" + fibonacci(5));
    }

    //    计算阶乘的方法，典型的递归方法
    public static long factorial(long n) {
        if (n >= 1) {
    //递归方法特点一：在方法中调用自己
            return n * factorial(n - 1);
        } else {
    //递归方法特点二：有至少一个出口条件
            return 1;
        }
    }

    //斐波那契数列：第一第二个数值都为1，之后每一项都是前两项和
    public static Long fibonacci(int i){
        if(i==1 || i==2)
            return 1L;
        else
            return fibonacci(i-1)+fibonacci(i-2);
    }
}


