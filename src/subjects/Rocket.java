package subjects;

import abstracts.Hero;
import abstracts.Location;
import abstracts.Transport;

public class Rocket extends Transport {
    public Rocket(String name, Point point, Location location, Hero... heroes) {
        super (name, point, location, heroes);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
