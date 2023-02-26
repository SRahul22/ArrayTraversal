public class driver {
    public static void main(String[] args) {
        arrayGenerator ag=new arrayGenerator();
        data[][] arr=ag.generate(10);
        printaArray.print(arr);
    }
}
