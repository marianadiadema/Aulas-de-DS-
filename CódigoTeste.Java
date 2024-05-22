public class Teste {
    public static void main(String[] args) {

        int i = 10;
        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.setCor("Verde");
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Cor do retângulo: " + retangulo.getCor());

        Triangulo triangulo = new Triangulo(3, 4);
        triangulo.setCor("Azul");
        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Cor do triângulo: " + triangulo.getCor());

        Circulo circulo = new Circulo(5);
        circulo.setCor("Vermelho");
        System.out.println("Diâmetro do círculo: " + circulo.getDiametro());
        System.out.println("Cor do círculo: " + circulo.getCor());

        Quadrado quadrado = new Quadrado(6);
        quadrado.setCor("Amarelo");
        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Cor do quadrado: " + quadrado.getCor());
    }
}
