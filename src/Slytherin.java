public class Slytherin extends Hogwards {
    int trick;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(
            String faculty,
            String firstName,
            String secondName,
            int distanceTransgress,
            int magicPower,
            int trick,
            int determination,
            int ambition,
            int resourcefulness,
            int thirstForPower
    ) {
        super(faculty, firstName, secondName, magicPower, distanceTransgress);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
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
                + ", хитрость: " + getTrick()
                + ", решительность: " + getDetermination()
                + ", амбициозность: " + getAmbition()
                + ", находчивость: " + getResourcefulness()
                + ", жажда власти: " + getThirstForPower();
    }

    static Slytherin[]slytherins = {
            new Slytherin("Slytherin","Draco","Malfoy",39,
                    37,50,60,80,76,79),
            new Slytherin("Slytherin","Graham","Montague",41,
                    42,67,74,82,79,77),
            new Slytherin("Slytherin","Gregory","Goyle",39,
                    40,55,79,84,72,85)
    };
}
