package frostmourne;

public class OtherClassWithToString {

    private int age;

    protected String name;

    Float score;

    public double money;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "OtherClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", money=" + money +
                '}';
    }
}
