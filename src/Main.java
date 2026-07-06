public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Mouse");
        produto1.setPreco(-320.90);

        System.out.printf("\nO produto: %s\nPreço: %.2f\n",
                produto1.getNome(), produto1.getPreco());


    }
}