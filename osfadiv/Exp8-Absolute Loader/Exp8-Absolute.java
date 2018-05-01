import java.io.*;
import java.io.RandomAccessFile.*;
import java.lang.*;

class absolute
{
String s,prog_name,obj_name,staddr;
long d=0;
int i,j,staddr1;
//char[] staddr=new char[30];
void display()
{
 
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("\nEnter the program name : ");
prog_name=br.readLine();//give program name SAMPLE
File f=new File("D:/sample.txt");
RandomAccessFile fr=new RandomAccessFile(f,"r");
long size=fr.length();
if(d<size)
{
s=fr.readLine();
if(s.charAt(0)=='H')
{
obj_name=s.substring(2,8);
System.out.println("Object Program Name From File : "+obj_name);
}
d=fr.getFilePointer();
}
if(prog_name.compareTo(obj_name)==0)
{
System.out.println("======================");
while(d<size)
{
s=fr.readLine();
if(s.charAt(0)=='T')
{
staddr=s.substring(2,8);
staddr1=Integer.parseInt(staddr);
i=12;
while(s.charAt(i)!='$')
{
if(s.charAt(i)!='^')
{
System.out.print("00"+staddr1+"\t"+s.charAt(i)+s.charAt(i+1)+"\n");
staddr1++;
i=i+2;
}
else
i++;
}
}
else if(s.charAt(0)=='E')
System.out.println("======================");
d=fr.getFilePointer();
}
 
}
else
System.out.println("Plz enter correct objectprogram name....");
fr.close();
}
catch(Exception e){}
}
}
 
class AbsoluteTest
{
public static void main(String s[])
{
absolute aa=new absolute();
aa.display();
}
}
