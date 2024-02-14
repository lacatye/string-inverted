package entities;

public class InvertedString {
	private String strOriginal;
    private String strInverted;

    public InvertedString(String strOriginal) {
        this.strOriginal = strOriginal;
        this.strInverted = inverterString(strOriginal);
    }

    private String inverterString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String getStrOriginal() {
        return strOriginal;
    }

    public String getStrInvertida() {
        return strInverted;
    }

    @Override
    public String toString() {
        return "String original: " + strOriginal + "\n"
                + "String invertida: " + strInverted;
    }
}
