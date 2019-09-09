public class King extends Character {

    //Sets the name and Weapon
    public King(String name) {
        super(name);
        weaponBehavior = new WeaponSword();
    }

    @Override
    public void display() {
        System.out.println(name+" is a noble king");
    }

    @Override
    public void attack() {
        super.attack();
    }
}
