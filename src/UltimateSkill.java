public class UltimateSkill extends Skill {
    public UltimateSkill(String name, ElementEffect elementEffect) {
        super(name, elementEffect);
    }
    @Override
    public void use() {
        System.out.println("Using Ultimate Skill:" + name + "[" + elementEffect.getElementName() + "]");
        elementEffect.applyEffect(name);
        System.out.println("Ultimate skill deals increased elemental elemental damage!");
    }
}
