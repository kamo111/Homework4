public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание 1
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задание 2
        int weatherDegree = 3;
        if (weatherDegree < 5) {
            System.out.println("На улице " + weatherDegree + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + weatherDegree + " градусов, можно идти без шапки.");
        }
        //Задание 3
        int carSpeed = 62;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно.");
        }
        //Задание 4
        int ageForStudy = 9;
        if ( ageForStudy > 2 && ageForStudy < 6) {
            System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить в детский сад.");
        }
        if ( ageForStudy > 7 && ageForStudy < 17) {
            System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить в школу.");
        }
        if ( ageForStudy >= 18 && ageForStudy <= 24) {
            System.out.println("Если возраст человека равен " + ageForStudy + ", то его место в университете.");
        }
        if ( ageForStudy > 24 ) {
            System.out.println("Если возраст человека равен " + ageForStudy + ", то ему пора ходить на работу.");
        }
        //Задание 5
        int childAge = 5;
        if ( childAge  < 5 ) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        else {
            System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутствии взрослого.");
        }
        if ( childAge  >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если больше 14 лет, то может кататься на аттракционев, без присутствия взрослого.");
        }
        if ( childAge  >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе без сопровождении взрослого.");
        }
        else {
            System.out.println("Если меньше 14 лет, то может кататься на аттракционев, но только с присутствием взрослого.");
        }
        //Задание 6
        int place = 22;
        if (place  >  60 && place <= 102) {
            System.out.println("Если место под номером " + place  +  ", то место стоячее");
        }
        if (place  <= 60 && place != 0) {
            System.out.println("Если место под номером " + place + ", то место сидячее");
        }
        else {
            System.out.println("Если мест " + place +  ", то вагон уже полностью забит ");
        }

        //Задание 7
        int one = 23;
        int two = 45;
        int three = 67;

        if ( one > two && one > three) {
            System.out.println("Самое большое число это " + one + ".");

        }
        else if ( two > one && two > three) {
            System.out.println("Самое большое число это " + two + ".");

        }
        else {
            System.out.println("Самое большое число это " + three + ".");
        }


    }
}