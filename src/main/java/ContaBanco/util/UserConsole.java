package ContaBanco.util;

import java.util.Scanner;

/**
 * 
 * <h1> Classe para interação de IO do console
 * <p> A classe provem algumas interações de IO no terminal básicas </p>
 * 
 */
public class UserConsole {
    private static final Scanner scanner = new Scanner(System.in);
    


    /**
     * 
     * <h1> Escrever no console
     * <p> O método escreve a string fornecida no console.
     * 
     * @param content <b>String</b>: Conteúdo que será escrito no console.
     * @throws Exception Quando o conteúdo do parâmetro "content" é nulo.
     * 
     */
    public static void write(String content) throws Exception {
        if (content == null) {
            throw new Exception("Enviado parâmetro nulo.");
        }

        if (content.isBlank()) {
            //Se o conteúdo da String for vazio retorna, não é necessário printa-lo no console
            return;
        }

        System.out.print(content);
    }



    /**
     * 
     * <h1> Escrever uma linha no console
     * <p> O método escreve a string fornecida no console e pula para uma nova linha.
     * 
     * @param content <b>String</b>: Conteúdo que será escrito no console.
     * @throws Exception Quando o conteúdo do parâmetro "content" é nulo.
     * 
     */
    public static void writeLine(String content) throws Exception {
        if (content == null) {
            throw new Exception("Enviado parâmetro nulo.");
        }

        if (content.isBlank()) {
            System.out.print("\n");
            return;
        }

        System.out.print(content + "\n");
    }



    /**
     * 
     * <h3>Lê uma linha no console</h3>
     * 
     * O método lê o input do console.
     * 
     * <h3>Exemplo:</h3>
     * 
     * <pre>
     * String userInput = UserConsole.readLine();
     * 
     *UserConsole.writeLine("Olá " + userInput + "!");
     * </pre>
     *
     * @return {@code String} Input do usuário no console.
     * 
     * @see java.util.Scanner
     * 
     */
    public static String readLine() {
        String input = scanner.nextLine().toString();

        return input;
    }
}
