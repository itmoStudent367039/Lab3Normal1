package abstracts;

import subjects.NextToTransport;
import subjects.Point;

public abstract class Hero implements CanChangeLocation, CanBeSeen {
    private String name;
    private Location location;
    private Point point;
    private Psyche psycheStatus;
    private Orders orders;
    private int weight;
    private int massage;

    public String getName() {
        return name;
    }

    public Hero(String name, Location location, Point point, Psyche psyche, Orders orders, int massage) {
        this.name = name;
    }

    public Hero(String name, Location location, Point point, int massage) {
        this.name = name;
        this.location = location;
        this.point = point;
        this.massage = massage;
        this.setWeight();
        this.joinToStory();
        this.setPsycheStatus();
    }
    public void setPsycheStatus() {
        if (name.equals("Клепка") && weight < massage * AccelerationOfGravity.EARTHGRAVITY.getValueOfGravity()) {
            System.out.println(name + " is situated in " + location.getCelestialBody().getName() + "\n" + "Weight of " + name + " is pretty low");
            psycheStatus = Psyche.NOTNORMAL;
            System.out.println(name + " went mad");
        } else
            psycheStatus = Psyche.NORMAL;
    }
    public Psyche getPsycheStatus() {
        return this.psycheStatus;
    }
    public void setWeight() {
        weight = massage * (location.getCelestialBody().getGravity().getValueOfGravity());
    }

    private void joinToStory() {
        System.out.println("Hero " + name + " joins to story");
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
        System.out.println("Hero " + name + " moved to location " + location.getLocationName());
    }

    public void go() {
        if (name.equals("Знайка"))
            point.sumX(15);
        else
            point.sumX(10);
        System.out.println("Hero " + name + " go location " + location.getLocationName() + " его координаты " + point.getX());
    }
    public void jump() {
        System.out.println(name + " is jumping " + location.getLocationName());
    }
    public void goWithJumps() {
        point.sumX(20);
        System.out.println("Hero " + name + " go with jumps location " + location.getLocationName() + " его координаты " + point.getX());
    }
    public void see(CanBeSeen object) {
        System.out.println(name + " sees " + object.getName() + "\n" + object.getName() + " is situated in location " + object.getLocation().getLocationName());
        System.out.println("His point is " + object.getPoint().getX());
    }
    public void thinkAbout(Hero hero) {
        if (hero.getPsycheStatus().equals(Psyche.NOTNORMAL)) {
            System.out.println(hero.getName() + " feels bad, his psyche is " + hero.getPsycheStatus() + " " + this.getName() + " needs to send him to transport");
            this.orders = Orders.GOTOTHEROCKET;
        } else {
            System.out.println("He is alright");
        }
    }
    public void toOrder(Hero hero) {
        switch (orders) {
            case GOTOTHEROCKET:
                System.out.println(name + " orders: " + hero.getName() + " have to go to the transport");
                break;
        }
    }
    public void abey(Hero hero) {
        if (this.psycheStatus == Psyche.NOTNORMAL) {
            System.out.println(this.name + ": I won't abey you, man");
            this.tumble();
        } else if (hero.orders == Orders.GOTOTHEROCKET) {
            System.out.println("Ok, I do it");
        }
    }
    public void tumble() {
        System.out.println(this.getName() + " is tumble");
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public Location getLocation() {
        return location;
    }
}
