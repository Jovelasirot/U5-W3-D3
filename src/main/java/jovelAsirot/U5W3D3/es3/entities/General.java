package jovelAsirot.U5W3D3.es3.entities;

import lombok.ToString;


@ToString
public class General extends StandardOfficer {

    private final int SALARY = 5000;

    public General(Officer nextOfficer) {
        super(nextOfficer);
    }

    @Override
    protected boolean canHandleRequest(int amount) {
        return amount <= SALARY;
    }
}
