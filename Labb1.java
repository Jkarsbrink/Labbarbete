package com.company;

public class Labb1 {

    public static void main(String[] args) {

        for(int i = 1; i < 101; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

            else if(i % 3 == 0 && i != 42){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i == 42){
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            }

            else{
                System.out.println(i);
            }


        }
    }
}
