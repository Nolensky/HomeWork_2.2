public class Main {

    public static void main(String[] args) {

        ServiceHogwarts serviceHogwarts = new ServiceHogwarts();
        serviceHogwarts.compareStudentsFaculty(Griffindor.griffindors[2], Griffindor.griffindors[0]);
        System.out.println();
        serviceHogwarts.compareStudentsFaculty(Hufflepuff.hufflepuffs[1], Hufflepuff.hufflepuffs[2]);
        System.out.println();
        serviceHogwarts.compareStudentsFaculty(Ravenclaw.ravenclaws[1],Ravenclaw.ravenclaws[0]);
        System.out.println();
        serviceHogwarts.compareStudentsFaculty(Slytherin.slytherins[0],Slytherin.slytherins[1]);
        System.out.println();
        Hufflepuff.hufflepuffs[1].compareHogwartsStudents(Griffindor.griffindors[0]);
        System.out.println();
        Slytherin.slytherins[0].printStudent();

    }
}