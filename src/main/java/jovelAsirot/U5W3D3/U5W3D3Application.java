package jovelAsirot.U5W3D3;

import jovelAsirot.U5W3D3.es1.entities.Info;
import jovelAsirot.U5W3D3.es1.entities.InfoAdapter;
import jovelAsirot.U5W3D3.es1.entities.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class U5W3D3Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W3D3Application.class, args);

        Info info = new Info("Joji", "Sanctuary", LocalDate.of(1992, 9, 18));

        InfoAdapter adapter = new InfoAdapter(info);

        UserData userData = new UserData(adapter);

        System.out.println("-------------------- User Data --------------------");
        System.out.println("Full name:" + userData.getDataSource().getFullName());
        System.out.println("Age: " + userData.getDataSource().getAge());

    }

}
