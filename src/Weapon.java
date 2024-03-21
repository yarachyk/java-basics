public class Weapon {
    public int hitPoints;
    public String weaponName;
    public Weapon(String weaponName, int hitPoints) {
        this.weaponName = weaponName;
        this.hitPoints = hitPoints;
    }

    public int makeHit(Weapon weapon) {
        return hitPoints;
    }
}
