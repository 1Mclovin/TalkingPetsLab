package talkingPets;

public class Pet {

    // must have a name field with setters ang getters
    private String name;

    public Pet(String name) {
    }


    public String getName() {
        return name;
    }

    public String setName(String name) {
     return   this.name = name;
    }


   // the speak method here
    public String speak(){
        return "whatever sound a pet makes";

    }


}
