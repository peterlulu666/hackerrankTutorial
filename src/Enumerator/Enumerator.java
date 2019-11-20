package Enumerator;

public class Enumerator {
    public static void main(String[] args) {
        var peterParker = new Person();
        var spiderMan = peterParker;
        var student = peterParker;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
        peterParker.hairColor = HairColor.RED;
        spiderMan.hairColor = HairColor.PINK;
        student.hairColor = HairColor.BLACK;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
        System.out.println(student.hairColor);


    }
}
