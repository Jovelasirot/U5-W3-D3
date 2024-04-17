package jovelAsirot.U5W3D3.es3.entities;


import lombok.ToString;


@ToString
public class Lieutenant extends StandardOfficer {

    private final int SALARY = 1000;

    public Lieutenant(Officer nextOfficer) {
        super(nextOfficer);
    }

    @Override
    protected boolean canHandleRequest(int amount) {
        return amount <= SALARY;
    }
}
