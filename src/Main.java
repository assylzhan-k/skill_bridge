public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bridge Pattern ===");
        ElementEffect anemo = new AnemoEffect();
        ElementEffect cryo = new CryoEffect();
        Skill normalSkill = new NormalSkill("Wind Blade", anemo);
        System.out.println("\nNormal skill with anemo:");
        normalSkill.use();
        System.out.println("\nSwithcing implementation to cryo:");
        normalSkill.setElementEffect(cryo);
        normalSkill.use();
        Skill ultimateSkill = new UltimateSkill("Frozen Tempest", cryo);
        System.out.println("\nUltimate skill with cryo:");
        ultimateSkill.use();
        System.out.println("\nSwitching implementation to anemo:");
        ultimateSkill.setElementEffect(anemo);
        ultimateSkill.use();
    }
}
