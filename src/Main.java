public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 19;
        if (age >= 18) {
            System.out.println("If the person is " + age + " he's an adult");
        } else {
            System.out.println("If the person is " + age + " he's not adult yet, please wait a little");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = -2;
        if (temperature < 5) {
            System.out.println("There is " + temperature + " degrees Celsius outside, you should wear a hat");
        } else {
            System.out.println("There is " + temperature + " degrees Celsius outside, you can go without a hat");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 5;
        if (speed > 60) {
            System.out.println("If your speed is " + speed + " you have to pay a fine");
        }
        if (speed <= 60) {
            if (speed >= 0) {
                System.out.println("If your speed is " + speed + " just keep driving");
            } else {
                System.out.println("If your speed is " + speed + " you entered the wrong data");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 34;
        boolean shouldGoToBed = age < 2;
        boolean shouldGoToChildcare = age >= 2 && age <= 6;
        boolean shouldGoToSchool = age >= 7 && age <= 18;
        boolean shouldGoToUni = age > 18 && age < 24;
        boolean shouldGoToWork = age >= 24 && age <= 60;
        boolean shouldNotCare = age > 60;
        if (age >= 0) {
            if (shouldGoToBed) {
                System.out.println("If the age is " + age + " he should go to bed");
            }
            if (shouldGoToChildcare) {
                System.out.println("If the age is " + age + " he should go to childcare");
            }
            if (shouldGoToSchool) {
                System.out.println("If the age is " + age + " he should go to school");
            }
            if (shouldGoToUni) {
                System.out.println("If the age is " + age + " he should go to university");
            }
            if (shouldGoToWork) {
                System.out.println("If the age is " + age + " he should go to work");
            }
            if (shouldNotCare) {
                System.out.println("If the age is " + age + " he shouldn't care about anything");
            }
        }
        else {
            System.out.println("If the age is " + age + " you entered the wrong data");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte age = 34;
        boolean canNotRide = age < 5;
        boolean canRideUnderCare = age >= 5 && age < 14;
        boolean canRide = age >= 14;
        if (age >= 0) {
            if (canNotRide) {
                System.out.println("If the child's age is " + age + " it can't go on the rides");
            }
            if (canRideUnderCare) {
                System.out.println("If the teen's age is " + age + " he can go on the rides under the Adult's care");
            }
            if (canRide) {
                System.out.println("If the person's age is " + age + " he or she can go on the rides");
            }
        }
        else {
            System.out.println("If the age is " + age + " you entered the wrong data");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte fulltrainCarCapacity = 102;
        byte seatsTrainCarCapacity = 60;
        short numberOfPassengers = 130;
        boolean freePlacesToSeat = numberOfPassengers < 60;
        boolean freePlacesToStand = numberOfPassengers < 102 && numberOfPassengers >= 60;
        boolean noPlaces = numberOfPassengers >= 102;
        if (numberOfPassengers >= 0) {
            if (freePlacesToSeat) {
                System.out.println("If the number of passengers is " + numberOfPassengers + " there are places to seat");
            }
            if (freePlacesToStand) {
                System.out.println("If the number of passengers is " + numberOfPassengers + " there are places to stand");
            }
            if (noPlaces) {
                System.out.println("If the number of passengers is " + numberOfPassengers + " there are no places for new passengers");
            }
        }
        else {
            System.out.println("If the number of passengers is " + numberOfPassengers + " you entered the wrong data");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 3;
        int two = 3;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Число 1 больше чисел 2 и 3");
        }
        else if (two > three){
            System.out.println("Число 2 больше числа 3");
        }
        else {
            System.out.println("Число 3 больше чем, число 1 и число 2");
        }
    }
}