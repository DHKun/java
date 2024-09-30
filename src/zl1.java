import java.util.Scanner;

class sz{
    public void sort1(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-j-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public int zbsc(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}

public class zl1 {
    public static void main(String[] args) {
        int[] yw = {56,72,12,34,8,63,87,91};
        for(int i=0; i<yw.length; i++){
            System.out.print(yw[i]+" ");
        }
        System.out.println();
        sz sz1 = new sz();
        sz1.sort1(yw);
        for(int i=0; i<yw.length; i++){
            System.out.print(yw[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target:");
        int n = sc.nextInt();
        int index = sz1.zbsc(yw,n);
        if(index!=-1){
            System.out.println("index is "+index);
        }else{
            System.out.println("no index");
        }
    }
}
