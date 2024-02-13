import java.util.Scanner;

public class happy {
    
        public static int ishappy(int n)
        {
        int rem,num,sum=0;
        
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n;
        while(result!=1 && result!=4)
        {
            result=ishappy(result);
        }
        System.out.println(result);
        if(result==1)
        {
            System.out.println("happy");
        }
        else if(result ==4)
        {
            System.out.println("not");
        }
        
    }

        
    }

