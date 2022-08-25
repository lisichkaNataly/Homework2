public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        // Задание 4
        System.out.println("Задача 4");
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес бойцов " + (boxer1Weight+boxer2Weight) + " кг");
        System.out.println("Разница весов двух бойцов "+ (boxer2Weight - boxer1Weight));


        // Задание 7
        System.out.println("Задача 7");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе составляет (1 способ) " + weightDifference + " кг");
        System.out.println("Разница в весе (2 способ) " + (boxer2Weight % boxer1Weight) + " кг");

        // Задание 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var workingPerHours = 8;
        var staff = totalWorkingHours / workingPerHours;
        System.out.println("Всего работников в компании - " + (totalWorkingHours / workingPerHours) + " человек");
        var moreStaff = staff + 94;
        System.out.println("После увеличения сотрудников на 94 человека, общая численность работников составляет - " + moreStaff + " человек");
        var clock = workingPerHours * moreStaff;
        System.out.println("Если в компании работает " + moreStaff + " человека, то всего " + clock + " часа может быть поделено между сотрудниками");









    }


}