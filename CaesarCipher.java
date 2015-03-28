/**
 * Created by fattyduck on 3/25/15.
 */
import java.util.Scanner;
public class CaesarCipher {
    public static String cipher(String str){
       char[] values=str.toCharArray();
       for(int i=0; i<values.length; i++){
           char letter=values[i];
           if(letter>='a'&& letter<='z')
               if(letter>='x'){
                   letter-=23;
                   //to make x=a y=b z=c
               }else{
                   letter+=3;
                   //to make a=d b=e c=f etc
               }
           else if(letter>='A'&& letter<='Z'){
               //uppercase version
               if(letter>='X'){
                   letter-=23;
               }else{
                   letter+=3;
               }
           }
           values[i]=letter;
       }
       return new String(values);
    }

    public static String decipher(String str){
        //The idea is that this is reversing cipher
        char[] values=str.toCharArray();
        for(int i=0; i<values.length; i++){
            char letter=values[i];
            if(letter>='a'&& letter<='z')
                if(letter>='d'){
                    letter-=3;
                    //to make d=a e=b f=c etc
                }else{
                    letter+=23;
                    //to make a=x b=y c=z
                }
            else if(letter>='A'&& letter<='Z'){
                //uppercase version
                if(letter>='D'){
                    letter-=3;
                }else{
                    letter+=23;
                }
            }
            values[i]=letter;
        }
        return new String(values);
    }


    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String input;
        System.out.println("Would you like to cipher or decipher using the Caesar Cipher?");
        input=scan.nextLine();

        if(input.equalsIgnoreCase("decipher")){
            System.out.println("What is the string you want to cipher?");
            input=scan.nextLine();
            System.out.println(decipher(input));
        }else if(input.equalsIgnoreCase("cipher")){
            System.out.println("What is the string you want to cipher?");
            input=scan.nextLine();
            System.out.println(cipher(input));
        }else{
            System.out.println("Please learn English before using this program");
        }
    }
}
