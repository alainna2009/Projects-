
public class Pet{
//Private data fields
    private String name;
    private String type;
    private int age;
//public constructors 
    public Pet(){
        setName("Pet Name");
        setType( "Animal");
        setAge( 1);

    }
    public Pet(String newName, int newAge, String newType){
        setName(newName);
        setAge(newAge);
        setType(newType);

    }

   public void  setType(String newType){
        type = newType;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    



//public set ot mutator methods for every private data field
    public void setName(String newName){
        name = newName; 
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
// public get or accessor methods for every private data field
    public String getName(){
        return name;
    }   

    public String getType(){
        return type;
    }

    public int getAge(){
        return age; 
    }

    public String speak(){
    if (type.equalsIgnoreCase("Dog")){
       return "Woof";
    }else if (type.equalsIgnoreCase("Cat")){
        return "Meow";
    }else {
        return "Yowl";
    }
}
// public toString method that returns a string description of the object state 
    public String toString(){
        String petInfo = "Pet infromation: \n";
        petInfo += "Type: "+ getType()+ "\n";
        petInfo += "Name: " + getName()+ "\n";
        petInfo += "Sound: " + speak() + "\n";
        petInfo += "Age: " + getAge() + "\n";      
        return petInfo;
        
    }

    
}
