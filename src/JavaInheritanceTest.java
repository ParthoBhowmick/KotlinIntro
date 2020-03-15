public class JavaInheritanceTest {

    public static void main(String[] args) {
        DogJava dogJava = new DogJava("black","Asian");
    }

}

// commented portion is valid

class AnimalJava {
    String color;
    AnimalJava(String color) {
        this.color = color;
        System.out.println("Animal color is " + this.color);
    }

//    AnimalJava() {}
}

class DogJava extends AnimalJava {

    String breed;

//    DogJava(String breed) {
//        this.breed = breed;
//        System.out.println("Dog color is " + this.color + " breed is " + this.breed);
//    }

    DogJava(String color,String breed) {
        super(color);
        this.breed = breed;
        System.out.println("Dog color is " + this.color + " breed is " + this.breed);
    }
}