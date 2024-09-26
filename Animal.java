import java.util.Date;

public class Animal {
    // creae a static int that keep track of the number of the animals created.
    static int numofanimals = 0;
    // ceate a constructor for our new animal objects
    public Animal () {
        numofanimals++;

    }
    // create a constructor that accepts a name
    public Animal(String aName) {
    }
}
    //Create a few fields
    // Sex will be male or female
    private String sex = "";
    private int age = 0;
    // weight will be in pounds
    private int weight = 0;
    // Create getters and setters
    // unique id for each animal
    private String animalID="";
    // animal name come from a text file called animalnames.txt
    private String animalnme = "";
    private Date animalbirthdate;







    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getAnimalID(){return animalID;}
    public void setAnimalID(String animalID) {this.animalID = animalID;}

      public String getanimalNAME(){return animalnme;}
    public void setAnimalnme  (String animalnme) {this.animalnme;}
public String getanimalbirthday (){return animalbirthdate;}



