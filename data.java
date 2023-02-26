public class data{
    int first;
    int second;

    public String toString(){
        String ans="("+first+","+second+")";
        return ans;
    }
    public data(int first,int second){
        this.first=first;
        this.second=second;
    }
    public data(){
        this.first=0;
        this.second=0;
    }
}