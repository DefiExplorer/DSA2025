import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    public static int findInt(String s, int i)
    {
        char c = s.charAt(i);
        if(c=='0'){return 0;}
        else if(c=='1'){return 1;}
        else if(c=='2'){return 2;}
        else if(c=='3'){return 3;}
        else if(c=='4'){return 4;}
        else if(c=='5'){return 5;}
        else if(c=='6'){return 6;}
        else if(c=='7'){return 7;}
        else if(c=='8'){return 8;}
        else if(c=='9'){return 9;}
        else if(c=='-'&&i==0){return -1;}
        else{return 1;}
        
    }
    public static void multiplyStrings(String s1,String s2)
    {
        //code here.
        int len1 = s1.length()-1;
        int len2 = s2.length()-1;
        int place = 1;
        int n1=0;
        int n2=0;
        int sign=1;
        while(len1>=0)
        {
            int x = findInt(s1,len1);
            if(x==-1)
            {
                sign=-1;
            }
            else{n1+=(place*x);}
            len1--;
            place*=10;
        }
        System.out.print(n1);
        System.out.println();
        //Reset values
        place=1;
        while(len2>=0)
        {
            int y = findInt(s2,len2);
            if(y==-1)
            {
                sign*=-1;// Sign changes accordingly.
            }
            else{n2 +=(place*y);}
            place*=10;
            len2--;
        }
        System.out.print(n2);
        System.out.println();
        int product = n1*n2;
        if (sign<0)
        {
        System.out.println(product*-1);
        }
        else{System.out.println(product);}
    }

	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner scn = new Scanner(System.in);
	    String s1 = scn.nextLine();
	    String s2 = scn.nextLine();
	    multiplyStrings(s1,s2);
	    
	}
}
