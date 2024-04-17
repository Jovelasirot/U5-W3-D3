package jovelAsirot.U5W3D3.es3.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class StandardOfficer implements Officer {

    private Officer nextOfficer;

    protected abstract boolean canHandleRequest(int amount);

    @Override
    public void handleRequest(int amount) {
        if (canHandleRequest(amount)) {
            System.out.println(getClass().getSimpleName() + " can have this salary: " + amount);
        } else if (nextOfficer != null) {
            nextOfficer.handleRequest(amount);
        } else {
            System.out.println("Money don't grow on trees (˵¯͒〰¯͒˵).");
        }
    }

    @Override
    public Officer getNext() {
        return nextOfficer;
    }
}
