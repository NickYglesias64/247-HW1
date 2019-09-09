public class WeaponNone implements WeaponBehavior {

    @Override
    public void attack() {
        System.out.println("Oh No! I lost my weapon");
    }
}
