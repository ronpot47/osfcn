import java.util.*;
class commonop{
    public static void main(String args[]){
        int n,i,j,f=0,k=0,count=0;
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
        op[f++]=ip[0];
        for(i=0;i<n;i++){
            str1=ip[i].substring(2);
            for(j=i+1;j<n;j++){
                str2=ip[j].substring(2);
                if(str1.equals(str2)){
                    ci[k]=ip[j].substring(0,1);
                    cf[k]=ip[i].substring(0,1);
                    k++;
                    count++;
                    
                }
                else{
                    op[f++]=ip[j];
                }
            }
        }
        for(j=0;j<k;j++){
            for(i=0;i<f;i++){
                op[i]=op[i].replace(ci[j],cf[j]);
            }
        }
        System.out.println("Final 3 address code is : ");
        for(i=0;i<n-count;i++){
            System.out.println(op[i]);
        }
    }
}

// Enter the number of expressions
// 4
// Enter the 3 address code
// p=a+c
// q=p+d
// r=a+c
// s=t+r
// Final 3 address code is : 
// p=a+c
// q=p+d
// s=t+p
