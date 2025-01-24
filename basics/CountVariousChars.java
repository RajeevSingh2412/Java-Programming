import java.util.*;

public class CountVariousChars{
    public static void main(String args[]){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        int n=s.length();
        int vow=0;
        int con=0;
        int dig=0;
        int sp=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                dig++;
            }
            else if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z')){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vow++;
                }
                else{
                    con++;
                }
            }
            else{
                sp++;
            }
        }
        System.out.println("Vowel = "+vow);
        System.out.println("Consonants = "+con);
        System.out.println("Digits = "+dig);
        System.out.println("Specal Characters = "+sp);
    }
}