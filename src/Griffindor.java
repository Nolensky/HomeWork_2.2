public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String faculty,
                      String firstName,
                      String secondName,
                      int distanceTransgress,
                      int magicPower,
                      int nobility,
                      int honor,
                      int bravery) {
        super(faculty, firstName, secondName, magicPower, distanceTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String  toString(){
        return "Имя ученика: " + getFirstName() + " " + getSecondName()
                + ", факультет: " + getFaculty()
                + ", расстояние трансгрессии: " + getDistanceTransgress()
                + ", сила магии: " + getMagicPower()
                + ", благородство: " + getNobility()
                + ", честь: " + getHonor()
                + ", храбрость: " + getBravery();
    }

    static Griffindor[]griffindors =  {
            new Griffindor("Griffindor","Harry", "Potter",40,
                    43,90, 80,85),
            new Griffindor("Griffindor","Hermione", "Granger", 43,
                    45,75,82,79),
            new Griffindor("Griffindor","Ron","Weasley",38,
                    40,49,80,83)
    };
}
