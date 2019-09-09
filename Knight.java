public class Knight extends Character {

    //Sets the name and Weapon
    public Knight(String name){
        super(name);
        weaponBehavior = new WeaponBow();
    }

    @Override
    public void display() {
        System.out.println(name+" is a valiant knight");
    }
}
