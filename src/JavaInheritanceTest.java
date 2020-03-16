public class JavaInheritanceTest {

    public static void main(String[] args) {
        DogJava dogJava = new DogJava("black","Asian");
        dogJava.printValue(5, 6, ((int a, int b) -> a+b));
    }



//    public int sum(int a,int b) {
//        return a+b;
//    }

}

// lambda can take a interface with a only abstract function

interface AddNumber {
    int addNum(int a,int b);
    //void printNumber();
}

// commented portion is valid

class AnimalJava {
    String color;
    AnimalJava(String color) {
        this.color = color;
        System.out.println("Animal color is " + this.color);
    }

    void printValue(int a,int b,AddNumber func) {
        System.out.println(func.addNum(a,b));
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