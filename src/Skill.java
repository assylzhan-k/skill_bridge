public abstract class Skill {
    protected String name;
    protected ElementEffect elementEffect;
    public Skill(String name, ElementEffect elementEffect) {
        this.name = name;
        this.elementEffect = elementEffect;
    }
    public void setElementEffect(ElementEffect elementEffect) {
        if (elementEffect == null) {
            throw new IllegalArgumentException("Element effect cannot be null");
        }
        this.elementEffect = elementEffect;
    }
    public abstract void use();
}
