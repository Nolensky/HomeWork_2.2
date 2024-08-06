public abstract class Hogwards {
    private final String faculty;
    private final String firstName;
    private final String secondName;
    private int magicPower;
    private int distanceTransgress;

    public Hogwards(String faculty,String firstName, String secondName, int magicPower, int distanceTransgress) {
        this.faculty = faculty;
        this.firstName = firstName;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.distanceTransgress = distanceTransgress;
    }


    public int getMagicPower() {
        return magicPower;
    }

    public int getDistanceTransgress() {
        return distanceTransgress;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setDistanceTransgress(int distanceTransgress) {
        this.distanceTransgress = distanceTransgress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void compareHogwartsStudents(Hogwards student) {

        if ((getMagicPower() + getDistanceTransgress()) > (student.getMagicPower() + student.getDistanceTransgress())) {
            System.out.println(getFirstName() + " " + getSecondName() + " обладает большей мощностью магии = " + (getMagicPower() + getDistanceTransgress())
                    + " , чем " + student.getFirstName() + " " + student.getSecondName() + " = " + (student.getMagicPower() + student.getDistanceTransgress()) );
        } else if (getMagicPower() + getDistanceTransgress() < student.getMagicPower() + student.getDistanceTransgress()) {
            System.out.println(student.getFirstName() + " " + student.getSecondName() + " обладает большей мощностью магии = " + (student.getMagicPower() + student.getDistanceTransgress())
                    + " , чем " + getFirstName() + " " + getSecondName() + " = " + (getMagicPower() + getDistanceTransgress()) );
        } else {
            System.out.println("Эти студенты равны по мощности магии");
        }
    }

    public void printStudent() {
        System.out.println(toString());
    }



}
