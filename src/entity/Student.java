package entity;

/**
 * @author ：Lenovo
 * @date ：Created in 2020/7/1 19:13
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String idNO;

    public Student(String name, int age, String gender, String idNO) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNO = idNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNO() {
        return idNO;
    }

    public void setIdNO(String idNO) {
        this.idNO = idNO;
    }
}
