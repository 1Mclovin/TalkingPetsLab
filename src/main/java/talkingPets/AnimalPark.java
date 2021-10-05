package talkingPets;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalPark {

    public static void main(String[] args) {


        ArrayList<Pet> userPets = new ArrayList<Pet>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
       int numberOfPets = scanner.nextInt();

       for (int i=0; i <numberOfPets; i++){
           System.out.println("What type of pets do you have?");
           String petType = scanner.next();
           System.out.println("Type in your pets name");
           String petsName= scanner.next();
          // scanner.close();

           if("Dog".equals(petType)){
               userPets.add(new Dog(petsName));
           }else if ("Cat".equals(petType)){
               userPets.add(new Cat(petsName));
           }else if ("Bird".equals(petType)){
               userPets.add(new Bird(petsName));
           }

           for(Pet pet : userPets){
               System.out.println(petsName + " says this " + pet.speak());

           }

       }





    }
}
