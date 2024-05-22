//Triangulo que estende a classe Figura, Triangulo herda todos os campos e métodos de Figura.
class Triangulo extends Figura {
   //declaram duas variáveis de instância privadas, base e altura, que representam a base e a altura do triângulo.
    private double base;
    private double altura;

    //construtor da classe Triangulo, que aceita dois parâmetros base e altura e inicializa esses valores.
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//getters e setters públicos para a base e a altura do triângulo, permitindo acesso e modificação desses valores.
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
// calcula e retorna a área do triângulo usando a fórmula da área do triângulo: área = (base * altura) / 2.
    public double area() {
        return base * altura / 2;
    }
}
 
