interface StringOperation{
    String noWhiteSpace(String sentence);
}

public class NoSpaceAndUpperCase {
    public static void main(String[] args) {
        StringOperation stringOperation=sentence ->sentence.replaceAll("\\s","").toUpperCase();
        System.out.println(stringOperation.noWhiteSpace("Functional Approach To Java"));
    }

}
