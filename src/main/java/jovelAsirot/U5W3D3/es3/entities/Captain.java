package jovelAsirot.U5W3D3.es3.entities;

import lombok.ToString;


@ToString
public class Captain extends StandardOfficer {

    private final int SALARY = 2000;

    public Captain(Officer nextOfficer) {
        super(nextOfficer);
    }

    @Override
    protected boolean canHandleRequest(int amount) {
        return amount <= SALARY;
    }

}
