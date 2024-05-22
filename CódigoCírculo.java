//declara a classe Circulo que estende a classe Figura, Circulo herda todos os campos e métodos de Figura.
class Circulo extends Figura {
    //declara uma variável de instância privada, raio, que representa o raio do círculo
    private double raio;
//construtor da classe Circulo, que aceita um parâmetro raio e inicializa o raio do círculo com esse valor.
    public Circulo(double raio) {
        this.raio = raio;
    }
//getters e setters públicos para o raio do círculo, permitindo acesso e modificação desse valor.
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
// calcula e retorna o diâmetro do círculo usando a fórmula: diâmetro = raio * 2 * π.
    public double getDiametro() {
        return raio * Math.PI * 2;
    }
}
