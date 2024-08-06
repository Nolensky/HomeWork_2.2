public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String faculty,
                      String firstName,
                      String secondName,
                      int distanceTransgress,
                      int magicPower,
                      int industriousness,
                      int loyalty,
                      int honesty)
    {
        super(faculty, firstName, secondName, magicPower, distanceTransgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String  toString(){
        return "Имя ученика: " + getFirstName() + " " + getSecondName()
                + ", факультет: " + getFaculty()
                + ", расстояние трансгрессии: " + getDistanceTransgress()
                + ", сила магии: " + getMagicPower()
                + ", трудолюбие: " + getIndustriousness()
                + ", верность: " + getLoyalty()
                + ", честоность: " + getHonesty();
    }

    static Hufflepuff[]hufflepuffs = {
            new Hufflepuff("Hufflepuff","Zacharias", "Smith", 39,
                    38, 70, 79, 75),
            new Hufflepuff("Hufflepuff","Cedric", "Diggory", 37,
                    41, 51, 79, 80),
            new Hufflepuff("Hufflepuff","Justin","Finch-Fletchley",40,
                    40,55,80,81)
    };
}
