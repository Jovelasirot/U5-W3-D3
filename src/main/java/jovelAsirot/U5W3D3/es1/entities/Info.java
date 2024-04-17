package jovelAsirot.U5W3D3.es1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {

    private String name;

    private String surname;

    private LocalDate birthDate;
}
