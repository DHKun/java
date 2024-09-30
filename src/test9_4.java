import java.util.Random;
public class test9_4 {
    public static void main(String[] args) {
        int i;
        int[] times = new int[100];
        int[] a =  new int[1000];
        Random rand = new Random();
        for (i = 0; i < a.length; i++) {
            int number = rand.nextInt(100)+1;
            a[i] = number;
            times[number - 1] = times[number - 1] + 1;
        }
        for(i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "出现的次数为" + times[i]);
        }
    }
}
