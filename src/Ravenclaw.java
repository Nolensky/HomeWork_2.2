public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String faculty,
                     String firstName,
                     String secondName,
                     int distanceTransgress,
                     int magicPower,
                     int smart,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(faculty, firstName, secondName, magicPower, distanceTransgress);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
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
                + ", ум: " + getSmart()
                + ", мудрость: " + getWisdom()
                + ", остроумие: " + getWit()
                + ", творчество: " + getCreativity();
    }

    static Ravenclaw[]ravenclaws = {
            new Ravenclaw("Ravenclaw","Cho","Chang",41,
                    39,50,39,49,50),
            new Ravenclaw("Ravenclaw","Padma","Patil",38,
                    38,50,60,57,65),
            new Ravenclaw("Ravenclaw","Marcus","Belby",35,
                    34,40,55,51,56)
    };
}
