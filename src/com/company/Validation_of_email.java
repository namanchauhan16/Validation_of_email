package com.company;
import java.util.Scanner;
public class Validation_of_email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String emails[]={"naman2001@gmail.com","neeraj324@gmail.com","kapil2000@yahoo.com","aman12345@gmail.com","kanika45@gmail.com","preeti66@yahoo.com","pankaj500@gmail.com","abhishek007@yahoo.com","gaurav45@yahoo.com","reyna404@gmail.com"};
        int flag=0;
        String x;
        System.out.print("Enter the Email ID you wanted to search from the list of emails:");
        x=sc.next();
        for(int i=0;i<emails.length;i++){
            if(x.equals(emails[i])){
                flag=i+1;
                break;
            }

        }
        if(flag!=0){
            System.out.println("Entered Email ID found at index "+flag);
        }
        else{
            System.out.println("Entered Email ID not found in the list of Emails.");
        }
    }
}
