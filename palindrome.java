public class palindrome {
    public static void main(String args[])
    {
        String s="samantha";
        StringBuilder ss=new StringBuilder(s);
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().equals(ss))
        {
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
    
}
