public class ServiceHogwarts {
    public void compareStudentsFaculty(Griffindor firstStudent, Griffindor secondStudent) {
        int totalPointsFirstStudent = firstStudent.getNobility()
                + firstStudent.getHonor()
                + firstStudent.getBravery();
        int totalPointsSecondStudent = secondStudent.getNobility()
                + secondStudent.getHonor()
                + secondStudent.getBravery();

        System.out.println("У " + firstStudent.getFirstName() + " " + firstStudent.getSecondName() + " благородство = " + firstStudent.getNobility() + ", честь = "
                + firstStudent.getHonor() + ", храбрость = " + firstStudent.getBravery());
        System.out.println("У " + secondStudent.getFirstName() + " " + secondStudent.getSecondName() + " благородство = " + secondStudent.getNobility() + ", честь = "
                + secondStudent.getHonor() + ", храбрость = " + secondStudent.getBravery());

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(firstStudent.getFirstName() + " лучший ученик факультета Гриффиндор, чем " + secondStudent.getFirstName());
        } else if (totalPointsFirstStudent < totalPointsSecondStudent) {
            System.out.println(secondStudent.getFirstName() + " лучший ученик факультета Гриффиндор, чем " + firstStudent.getFirstName());
        } else {
            System.out.println("Эти ученики равны");
        }

    }

    public void compareStudentsFaculty(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int totalPointsFirstStudent = firstStudent.getIndustriousness()
                + firstStudent.getHonesty()
                + firstStudent.getLoyalty();
        int totalPointsSecondStudent = secondStudent.getIndustriousness()
                + secondStudent.getHonesty()
                + secondStudent.getLoyalty();

        System.out.println("У " + firstStudent.getFirstName() + " " + firstStudent.getSecondName() + " трудолюбие = " + firstStudent.getIndustriousness() + ", честность = "
                + firstStudent.getHonesty() + ", верность = " + firstStudent.getLoyalty());
        System.out.println("У " + secondStudent.getFirstName() + " " + secondStudent.getSecondName() + " трудолюбие = " + secondStudent.getIndustriousness() + ", честность = "
                + secondStudent.getHonesty() + ", верность = " + secondStudent.getLoyalty());

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(firstStudent.getFirstName() + " лучший ученик факультета Пуффендуй, чем " + secondStudent.getFirstName());
        } else if (totalPointsFirstStudent < totalPointsSecondStudent) {
            System.out.println(secondStudent.getFirstName() + " лучший ученик факультета Пуффендуй, чем " + firstStudent.getFirstName());
        } else {
            System.out.println("Эти ученики равны");
        }

    }

    public void compareStudentsFaculty(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int totalPointsFirstStudent = firstStudent.getSmart()
                + firstStudent.getWisdom()
                + firstStudent.getWit()
                + firstStudent.getCreativity();
        int totalPointsSecondStudent = secondStudent.getSmart()
                + secondStudent.getWisdom()
                + secondStudent.getWit()
                + secondStudent.getCreativity();

        System.out.println("У " + firstStudent.getFirstName() + " " + firstStudent.getSecondName() + " ум = " + firstStudent.getSmart() + ", мудрость = "
                + firstStudent.getWisdom() + ", остроумие = " + firstStudent.getWit() + ", творчество " + firstStudent.getCreativity());
        System.out.println("У " + secondStudent.getFirstName() + " " + secondStudent.getSecondName() + " ум = " + secondStudent.getSmart() + ", мудрость = "
                + secondStudent.getWisdom() + ", остроумие = " + secondStudent.getWit() + ", творчество " + secondStudent.getCreativity());

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(firstStudent.getFirstName() + " лучший ученик факультета Когтевран, чем " + secondStudent.getFirstName());
        } else if (totalPointsFirstStudent < totalPointsSecondStudent) {
            System.out.println(secondStudent.getFirstName() + " лучший ученик факультета Когеувран, чем " + firstStudent.getFirstName());
        } else {
            System.out.println("Эти ученики равны");
        }

    }

    public void compareStudentsFaculty(Slytherin firstStudent, Slytherin secondStudent) {
        int totalPointsFirstStudent = firstStudent.getTrick()
                + firstStudent.getDetermination()
                + firstStudent.getAmbition()
                + firstStudent.getResourcefulness()
                + firstStudent.getThirstForPower();
        int totalPointsSecondStudent = secondStudent.getTrick()
                + secondStudent.getDetermination()
                + secondStudent.getResourcefulness()
                + secondStudent.getThirstForPower();

        System.out.println("У " + firstStudent.getFirstName() + " " + firstStudent.getSecondName() + " хитрость = " + firstStudent.getTrick() + ", решительность = "
                + firstStudent.getDetermination() + ", амбициозность = " + firstStudent.getAmbition() + ", находчивость "
                + firstStudent.getResourcefulness() + " жажда власти " + firstStudent.getThirstForPower());
        System.out.println("У " + secondStudent.getFirstName() + " " + secondStudent.getSecondName() + " хитрость = " + secondStudent.getTrick() + ", решительность = "
                + secondStudent.getDetermination() + ", амбициозность = " + secondStudent.getAmbition() + ", находчивость "
                + secondStudent.getResourcefulness() + ", жажда власти " + secondStudent.getThirstForPower());

        if (totalPointsFirstStudent > totalPointsSecondStudent) {
            System.out.println(firstStudent.getFirstName() + " лучший ученик факультета Слизерин, чем " + secondStudent.getFirstName());
        } else if (totalPointsFirstStudent < totalPointsSecondStudent) {
            System.out.println(secondStudent.getFirstName() + " лучший ученик факультета Слизерин, чем " + firstStudent.getFirstName());
        } else {
            System.out.println("Эти ученики равны");
        }
    }
}
