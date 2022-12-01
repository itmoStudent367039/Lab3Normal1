package subjects;

import abstracts.CelestialBody;
import abstracts.Location;

public class Road extends Location {
    private int length;
    public Road(String name, CelestialBody celestialBody, int length) {
        super(name, celestialBody);
        this.length = length;
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
