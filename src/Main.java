import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
  Animal[]animals={new Shark(), new Shark(),new Shark(),new Turtle(), new Turtle(),new Turtle(),new Turtle(),new Eagle(),
          new Eagle(),new Eagle(),new Eagle()};

        Shark[] sharks = new Shark[3];
        Turtle[] turtles = new Turtle[4];
        Eagle[] eagles = new Eagle[4];

        int sharkind = 0;
        int turtleind = 0;
        int eagleind = 0;

        for (Animal animal : animals) {
            if (animal  instanceof Shark){
                sharks[sharkind]=(Shark)animal;
                sharkind++;
            }else if (animal instanceof Turtle){
                turtles[turtleind]=(Turtle)animal;
                turtleind++;
            }else if (animal instanceof Eagle){
                eagles[eagleind]=(Eagle)animal;
                eagleind++;
            }
        }

        for (Animal animal1 : animals) {
            if (animal1.getClass()==Shark.class){
                ((Shark) animal1).attack();
            }else if (animal1.getClass()==Turtle.class){
                ((Turtle) animal1).swim();
            }else if (animal1.getClass()==Eagle.class){
                ((Eagle) animal1).fly();
            }else{
                System.out.println("bbb");
            }


        }  System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }









    }


