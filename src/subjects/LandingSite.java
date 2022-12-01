package subjects;

import abstracts.CelestialBody;
import abstracts.Location;

public class LandingSite extends Location {
    public LandingSite(String name, CelestialBody celestialBody) {
        super(name, celestialBody);
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
