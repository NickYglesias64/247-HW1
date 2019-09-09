public class Troll extends Character {

    //Sets the name and Weapon
    public Troll(String name) {
        super(name);
        weaponBehavior = new WeaponAxe();
    }

    @Override
    public void display() {

        System.out.println(name+" is a funny troll");
    }
}
