package jovelAsirot.U5W3D3.es3.entities;

import lombok.ToString;


@ToString
public class Colonel extends StandardOfficer {

    private final int SALARY = 4000;

    public Colonel(Officer nextOfficer) {
        super(nextOfficer);
    }

    @Override
    protected boolean canHandleRequest(int amount) {
        return amount <= SALARY;
    }
}
