public class Character {
    private String name;
    private int strength;
    private int dexterity;
    private int stamina;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int constitution;

    Character() {
        this("Unnamed");
    }

    Character(String name) {
        this(name,
             new D6().roll(3),
             new D6().roll(3),
             new D6().roll(3),
             new D6().roll(3),
             new D6().roll(3),
             new D6().roll(3),
             new D6().roll(3));
    }

    Character(String name,
              int strength,
              int dexterity,
              int stamina,
              int intelligence,
              int wisdom,
              int charisma,
              int constitution) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.constitution = constitution;
    }

    public String getName() {
        return this.name;
    }
}
