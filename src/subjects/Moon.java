package subjects;

import abstracts.AccelerationOfGravity;
import abstracts.CelestialBody;

public class Moon extends CelestialBody {
    public Moon(String name, AccelerationOfGravity gravity) {
        super(name, gravity);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
