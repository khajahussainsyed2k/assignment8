package com.company;

import java.util.Scanner;
class EvenNumberException extends Exception {
    public EvenNumberException(String found_evenNumber) {
        super(found_evenNumber);
    }
}
class NegativeNumberException extends Exception {
    public NegativeNumberException(String found_negativeNumber) {
        super(found_negativeNumber);
    }
}
class ZeroException extends Exception {
    public ZeroException(String found_zero) {
        super(found_zero);
    }
}
public class NewExceptionTypes {
    public void checkException(int n) {
        //throw exceptions based on input
        try{
            if(n%2==0 && n!=0) throw new EvenNumberException("Found EvenNumber");
            else if(n<0) throw new NegativeNumberException("Found NegativeNumber");
            else if(n==0) throw new ZeroException("Found Zero");
            else throw new NullPointerException();
        }
        catch (EvenNumberException | NegativeNumberException | ZeroException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("inside Finally Block");
        }

    }
    public static void main(String args[]){
        NewExceptionTypes exception=new NewExceptionTypes();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        exception.checkException(n);
    }


}
