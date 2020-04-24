public class Classroom {

    public static void main(String[] args) {

        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        System.out.println(jeanClaude.whoAmI());

        Wilder xavier = new Wilder("Xavier", false);
        System.out.println(xavier.whoAmI());

        xavier.setAware(true);
        System.out.println("Mais après un confinement de plus d'un mois, je suis aware.");
        
    }
}
