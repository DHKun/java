class ewsz{
    public double avg(int[][] a){
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return (double)sum/count;
    }
}

public class demo {
    public static void main(String[] args) {
        int[][] e = {{18,12,6},{34,13,22},{56,3,2}};
        ewsz test = new ewsz();
        System.out.println(test.avg(e));
    }
}
