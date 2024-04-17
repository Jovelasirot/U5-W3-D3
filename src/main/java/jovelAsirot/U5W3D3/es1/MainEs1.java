package jovelAsirot.U5W3D3.es1;

import jovelAsirot.U5W3D3.es1.entities.DataSource;
import jovelAsirot.U5W3D3.es1.entities.Info;
import jovelAsirot.U5W3D3.es1.entities.InfoAdapter;

import java.time.LocalDate;

public class MainEs1 {
    public static void main(String[] args) {

        Info info = new Info("Joji", "Sanctuary", LocalDate.of(1992, 9, 18));

        DataSource adaptor = new InfoAdapter(info);

        System.out.println("------------- User data -------------");
        System.out.println("Full name: " + adaptor.getFullName());
        System.out.println("Ege: " + adaptor.getAge());

    }
}
