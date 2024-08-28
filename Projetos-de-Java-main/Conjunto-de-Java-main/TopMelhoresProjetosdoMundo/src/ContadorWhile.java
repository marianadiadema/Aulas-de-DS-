package cap03; // cria um pacote java
import javax.swing.JOptionPane; //chama um pacote java (que cria janelas)
public class ContadorWhile { //abre a classe pública ContadorWhile
    public static void main(String args[]) { //abre o método principal da classe
        try { //abre o método de repetição try
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade!: ")); //cria uma variável que pede informações para o usuário
            int contador = limite; //abre uma variável que pega a resposta da variável anterior
            while (contador >= 0) { //abre outro método de repetição, esse sendo o while
                System.out.println(contador); // coloca na tela a informações
                contador--; // Faz a conta
            }
            System.out.println("Fim do contador regressivo\n"); // coloca na tela a finalização 
            contador = 0; // Finaliza a conta 
            do { // Vai fazer que o while começar e depois checar isso 
                System.out.println(contador);
                contador++;
            } while (contador <= limite); // é um looping quando você não ter um "fim" definido 
            System.out.println(("Fim do contador progressivo."));
        } catch (NumberFormatException erro) { // Se tiver um erro, ele vai achar e mostra-la
            System.out.println("Não foi encontrado um número inteiro válido!\n" + erro.toString()); // se o argumento for inválido
        }
        System.exit(0);
    }
}
