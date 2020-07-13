import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
      String s =" github is a great platform";
      count(s);
     
    }
    public static void count(String a)
    {
        char []ch=a.toCharArray();
        int l=0;  
        int i;
        for(i=0;i<a.length();i++)
        {
            if(Character.isLetter(ch[i]))
             {l++;}
        } System.out.println(l);
    }
    }
