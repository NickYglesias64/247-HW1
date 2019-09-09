//Nicholas Yglesias
public abstract class Character extends MedievalDriver  implements WeaponBehavior{

    protected String name;
    protected WeaponBehavior weaponBehavior;

    //Constructor
    public Character(String name) {
        this.name = name;
    }
    //sets the base attack
    public void attack(){
        weaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior wB) {
        weaponBehavior = wB;
    }

    public abstract void display();
}
