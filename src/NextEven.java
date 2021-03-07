interface Even{
    long nextEvenNumber(long even);
}

public class NextEven {
    public static void main(String[] args) {
        Even even=(long num)->num%2==0?num+2:num+1;
        System.out.println(even.nextEvenNumber(1998));
        System.out.println(even.nextEvenNumber(1995));
    }
}
