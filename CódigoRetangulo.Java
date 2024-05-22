//declara a classe Retangulo que estende a classe Figura
// retangulo herda todos os campos e métodos de Figura.
class Retangulo extends Figura {
    //declaram duas variáveis de instância privadas
    // lado1 e lado2 representam os comprimentos dos lados do retângulo.
    private double lado1;
    private double lado2;

//construtor padrão da classe Retangulo, que inicializa os lados do retângulo como zero
    public Retangulo() {

        this.lado1 = 0;
        this.lado2 = 0;
    }
//construtor sobrecarregado que aceita dois parâmetros lado1 e lado2 e inicializa os lados do retângulo com os valores fornecidos.
    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
// são getters e setters públicos para os lados do retângulo, permitindo acesso e modificação desses valores.
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
//calcula e retorna a área do retângulo usando a fórmula: área = lado1 * lado2
    public double area() {
        return lado1 * lado2;
    }
}
 
