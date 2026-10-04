public class NormalSkill extends Skill {
    public NormalSkill(String name, ElementEffect elementEffect) {
        super(name, elementEffect);
    }
    @Override
    public void use() {
        System.out.println("Using normal skill:" + name + "[" + elementEffect.getElementName() + "]");
        elementEffect.applyEffect(name);
    }
}
