public class arrayGenerator{
    public data[][] generate(int n){
        data[][] arr=new data[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=new data(i,j);
            }
        }
        return arr;
    }
}