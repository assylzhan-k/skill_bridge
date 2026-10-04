public class AnemoEffect implements ElementEffect {
    @Override
    public void applyEffect(String skillName) {
        System.out.println(skillName + " creates a powerful wind effect!!");
}

    @Override
    public String getElementName() {
        return "Anemo";
    }
}
