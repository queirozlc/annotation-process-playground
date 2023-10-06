import com.demo.annotation.playground.EmployeeBuilder;

public class Main {

    public static void main(String[] args) {
        var employee = new EmployeeBuilder()
                .name("John")
                .age(30)
                .build();

        System.out.println(employee);
    }
}
