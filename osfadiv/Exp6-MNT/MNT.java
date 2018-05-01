import java.util.Scanner;
class Macro
{
static int mntc,mdtc;
public static void main(String args[])
{
int p,j,i=0,n=5;
String name=new String();;
String a[]={ &quot;MACRO&quot;, &quot;ADDM&quot;, &quot;A 1,DATA&quot;, &quot;A 2 DATA&quot;, &quot;A 3 DATA&quot;, &quot;MEND&quot; ,&quot;DATA DC
F5&quot;,&quot;END&quot;};
mntc=0;
mdtc=0;
System.out.println(&quot;INDEX&quot;+&quot; &quot;+&quot;NAME&quot;+&quot; &quot;+&quot;MDT INDEX&quot;);
while(a[i]!=&quot;END&quot;)
{
if(a[i]==&quot;MACRO&quot;)
{
name=a[i+1];
break;
}
i++;
}
System.out.println(mntc+&quot; &quot;+name+&quot; &quot;+mdtc);
mntc++;
}
}
