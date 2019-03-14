public class Heroes{

    private String name;
    private int age;

    public Heroes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public void setAge(int ageValue) {
        this.age = ageValue;
    }
}