//declara a classe Quadrado que estende a classe Retangulo, Quadrado herda todos os campos e métodos de Retangulo
class Quadrado extends Retangulo {
    //Quadrado herda o comportamento da classe Retangulo
    public Quadrado(double lado) {
        super(lado, lado);
    }
}
