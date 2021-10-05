package talkingPets;

public class Dog extends Pet{

    @Override
    public String speak(){
        return "Ruff i luv you";
    }

    public Dog (String name){
         super(name);
    }

}
