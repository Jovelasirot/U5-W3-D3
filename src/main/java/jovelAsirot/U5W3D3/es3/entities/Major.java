package jovelAsirot.U5W3D3.es3.entities;

import lombok.ToString;


@ToString
public class Major extends StandardOfficer {

    private final int SALARY = 3000;

    public Major(Officer nextOfficer) {
        super(nextOfficer);
    }

    @Override
    protected boolean canHandleRequest(int amount) {
        return amount <= SALARY;
    }
}
