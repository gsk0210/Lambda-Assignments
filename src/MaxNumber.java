interface Max{
    int findMaxNumber(int a,int b);
}

public class MaxNumber {

    public static void main(String[] args) {

        Max max=(int a,int b)->Math.max(a,b);
        System.out.println(max.findMaxNumber(17,2));


    }
}
