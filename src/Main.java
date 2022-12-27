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
        byte agePerson1 = 18;
        byte agePerson2 = 17;
        System.out.print("Если возраст человека равен " + agePerson1);
        if (agePerson1 >= 18) {
            System.out.println(", то он совершеннолетний.");
        } else {
            System.out.println(", то он не достиг совершеннолетия.");
        }
        System.out.print("Если возраст человека равен " + agePerson2);
        if (agePerson2 >= 18) {
            System.out.println(", то он совершеннолетний.");
        } else {
            System.out.println(", то он не достиг совершеннолетия.");
        }
    }

    public static void task2() {
        byte temperatureOutside1 = 5;
        byte temperatureOutside2 = 4;
        System.out.print("На улице " + temperatureOutside1 + " градусов, ");
        if (temperatureOutside1 < 5) {
            System.out.println(" нужно надеть шапку.");
        } else {
            System.out.println(" можно идти без шапки.");
        }
        System.out.print("На улице " + temperatureOutside2 + " градусов, ");
        if (temperatureOutside2 < 5) {
            System.out.println(" нужно надеть шапку.");
        } else {
            System.out.println(" можно идти без шапки.");
        }
    }

    public static void task3() {
        short speed1 = 135;
        short speed2 = 60;
        System.out.print("Если скорость " + speed1 + ", то ");
        if (speed1 > 60) {
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }
        System.out.print("Если скорость " + speed2 + ", то ");
        if (speed2 > 60) {
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }
    }

    public static void task4() {
        byte age = 55;
        boolean ItIsTimeToGoToKindergarten = age >= 2 && age <= 6;
        boolean ItIsTimeToGoToSchool = age >= 7 && age <= 18;
        boolean ItIsTimeToGoToUniversity = age > 18 && age <= 24;
        boolean ItIsTimeToGoForWork = age > 24;
        if (ItIsTimeToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
        } else {
            if (ItIsTimeToGoToSchool) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
            } else {
                if (ItIsTimeToGoToUniversity) {
                    System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
                } else {
                    if (ItIsTimeToGoForWork) {
                        System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу");
                    }
                }
            }
        }
    }


    public static void task5() {
        byte age = 55;
        boolean cannotRideAttraction = age < 5;
        boolean canRideAttractionWithAdult = age >= 5 && age <= 14;
        if (cannotRideAttraction) {
            System.out.println("Если возраст ребенка равен " + age + " лет, то ему нельзя кататься на аттракционе");
        } else {
            if (canRideAttractionWithAdult) {
                System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    public static void task6() {
        byte numberOfPeople = 102;
        boolean SeatPlace = numberOfPeople < 60;
        boolean StandingPlace = numberOfPeople < 102;
        if (SeatPlace) {
            System.out.println("В вагоне есть сидячее место");
        } else {
            if (StandingPlace) {
                System.out.println("В вагоне есть стоячее место");
            } else {
                System.out.println("Вагон уже полностью забит, мест нет");
            }
        }
    }

    public static void task7() {
        int one = 200000004;
        int two = 200000005;
        int three = 200000003;
        if (one >= two) {
            if (one >= three) {
                System.out.println("Самое большее число - " + one);
            } else {
                System.out.println("Самое большее число - " + three);
            }
        } else {
            if (two >= three) {
                System.out.println("Самое большее число - " + two);
            } else {
                System.out.println("Самое большее число - " + three);
            }
        }
        System.out.println("Домашка выполнена!");
    }
}