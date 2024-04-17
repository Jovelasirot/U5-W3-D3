package jovelAsirot.U5W3D3.es2.entities;


import lombok.ToString;

@ToString
public class SinglePage implements Page {

    @Override
    public int getNumberOfPage() {
        return 1;
    }
}
