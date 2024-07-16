public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int ageYoung = 16;

        if (ageYoung < 18) {
            System.out.println("Если возраст человека равен " + ageYoung + " он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + ageYoung + ", то он совершеннолетний");
        }


        //Task 2
        System.out.println("Task 2");

        int weatherTemperature = 14;

        if (weatherTemperature < 5) {
            System.out.println("На улице " + weatherTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weatherTemperature + " градусов, можно идти без шапки");
        }


        //Task 3
        System.out.println("Task 3");

        int currentSpeed = 70;
        int speedLimit = 60;
        boolean speedCheck = currentSpeed > speedLimit; //пробовал применить boolean, можно (или нужно) было сделать проще

        if (speedCheck) {
            System.out.println("Если скорость " + currentSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + currentSpeed + ", можно ездить спокойно");
        }

        //Task 4
        System.out.println("Task 4");

        int age = 2;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        /* else if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно сидеть дома");
            }
          Как будто бы, не хватает ещё этого интервала
         */

        //Task 5
        System.out.println("Task 5");

        int childrenAge = 13;

        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он не может кататься на аттракционе");
        } else if (childrenAge >= 5 && childrenAge < 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься только в сопровождении " +
                    "взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childrenAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься без сопровождения взрослого.");
        }


        //Task 6
        System.out.println("Task 6");

        int numberOfPassengers = 3;
        int totalCapacity = 102;
        int countSeats = 60;

        if (numberOfPassengers <= countSeats) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (numberOfPassengers > countSeats && numberOfPassengers <= totalCapacity) {
            System.out.println("В вагоне остались только стоячие места.");
        } else if (numberOfPassengers > totalCapacity) {
            System.out.println("В вагоне нет мест.");
        }


        //Task 7
        System.out.println("Task 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (one < two && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
        //если первые два условия не соблюдены, третье число - самое большое

    }
}
