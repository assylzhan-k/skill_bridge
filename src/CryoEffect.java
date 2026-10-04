public class CryoEffect implements ElementEffect {
    @Override
    public void applyEffect(String skillName) {
        System.out.println(skillName + " freezes enemies with ice");
    }
    @Override
    public String getElementName() {
        return "Cryo";
    }
}
