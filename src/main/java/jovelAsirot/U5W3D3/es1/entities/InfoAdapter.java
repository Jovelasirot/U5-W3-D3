package jovelAsirot.U5W3D3.es1.entities;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InfoAdapter implements DataSource {

    private Info info;


    @Override
    public String getFullName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {

        LocalDate birthDate = info.getBirthDate();

        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
