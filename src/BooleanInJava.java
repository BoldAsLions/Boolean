public class BooleanInJava {
    public static void main(String[] args) {

        int a = 0;
        boolean b = false;

        System.out.println(b);

        boolean passDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if (false) {
            System.out.println("We are in the if statement!");
            } else if (true) {
                System.out.println("You will find rest for your soul in the Truth!");

            }
        if (passDoor) {
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
        }
        if (missedDoor) {
            System.out.println("We passed the second door!");
            doorCount = doorCount + 1;
        }
        if (passDoor) {
            System.out.println("We passed at the third door!");
            doorCount = doorCount + 1;
        }
        if(doorCount == 3){
            passDoor = true;
        }
        if(passedAllDoors) {
            System.out.println("Congratulations you won the program!");
        }
    }
}

