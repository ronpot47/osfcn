import java.util.*;
class deadcode{
    public static void main(String args[]){
        int n,i,j,f=0,k=0,deadcodecount=0;
        String str1,str2,str3,str4;
        String ip[]=new String[10];
        String op[]=new String[10];
        String ci[]=new String[10];
        String cf[]=new String[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of expressions");
        n=sc.nextInt();
        System.out.println("Enter the 3 address code");
        for(i=0;i<n;i++){
            ip[i]=sc.next();
        }
        for(i=0;i<n;i++){
            str1=ip[i].substring(0,1);
            for(j=i+1;j<n;j++){
                str2=ip[j].substring(2);
                if(str2.contains(str1)){
                    op[f++]=ip[i];
                } else {
                    deadcodecount++;
                }
            }
            if(i == n-1){
                op[f++]=ip[i];
            }
        }
        System.out.println("Final 3 address code is : ");
        for(i=0;i<n-deadcodecount+1;i++){
            System.out.println(op[i]);
        }
    }
}

// Enter the number of expressions
// 3
// Enter the 3 address code
// a=b+c
// b=c+d
// c=d+b
// Final 3 address code is : 
// b=c+d
// c=d+b
