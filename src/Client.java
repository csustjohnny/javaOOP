import entity.Student;

/**
 * @author ：Lenovo
 * @date ：Created in 2020/7/1 19:32
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student("肖云龙",21,"男","123456");
        System.out.println("name='" + student.getName() + '\'' +
                ", age=" + student.getAge() +
                ", gender='" + student.getGender() + '\'' +
                ", idNO='" + student.getIdNO() + '\''
        );
    }
}
