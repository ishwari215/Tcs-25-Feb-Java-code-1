import java.util.*;

class ipa1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
      
        while(num>0){
            if(num%2==0){
                count = count+1;
            }
            num = num/10;
        }

        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("0");
        }
    }
}
