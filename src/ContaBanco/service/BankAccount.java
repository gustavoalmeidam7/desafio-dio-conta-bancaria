package ContaBanco.service;
/**
 * A classe {@code BankAccount} representa uma conta bancária com detalhes básicos
 * como número da conta, agência, nome do cliente e saldo. Ela fornece métodos
 * para recuperar informações da conta e gerenciar seus detalhes.
 * 
 * <p>Esta classe é projetada para ser usada em sistemas bancários onde o
 * gerenciamento de contas é necessário. Inclui funcionalidades para obter e
 * definir propriedades da conta, bem como um método para recuperar informações
 * formatadas da conta.
 * 
 * <p>Exemplo de uso:
 * <pre>{@code
 * BankAccount conta = new BankAccount(12345, "001", "João Silva", 1500.00);
 * System.out.println(conta.getAccountInfo());
 * }</pre>
 */
public class BankAccount {
    private int    accountNumber     = 0;
    private String accountAgency     = "";
    private String accountCustomerName = "";
    private Double accountBalance    = 0.0d;

    public BankAccount() {
        
    }

    public BankAccount(int accountNumber, String accountAgency, String accountCustomerName, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountAgency = accountAgency;
        this.accountCustomerName = accountCustomerName;
        this.accountBalance = accountBalance;
    }
    
    /**
     * <h3>Retorna as informações bancarias da conta em formato de string formatada.</h3>
     * 
     * <h3>Exemplo:</h3>
     * 
     * <pre>
     *BankAccount account = new BankAccount(1234, "432-1", "Josefino Garibaldo", 5.99);
     *System.out.println(account.getAccountInfo());
     * </pre>
     * 
     * @return {@code String} O número da conta, agência, nome do cliente e saldo:
     *<pre>
     *"
     * Olá Josefino Garibaldo, obrigado por criar uma conta em nosso banco, sua agência é 432-1, conta 1234 e seu saldo 5.99 já está disponível para saque.
     *"
     *</pre>
     */
    public String getAccountInfo() {
        return """
                \nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.
                """.formatted(this.accountCustomerName, this.accountAgency, this.accountNumber, this.accountBalance);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountAgency() {
        return this.accountAgency;
    }

    public String getAccountCustomerName() {
        return this.accountCustomerName;
    }

    public Double getAccountBalance() {
        return this.accountBalance;
    }


    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setAccountAgency(String newAccountAgency) {
        this.accountAgency = newAccountAgency;
    }

    public void setAccountCustomerName(String newAccountCustomerName) {
        this.accountCustomerName = newAccountCustomerName;
    }

    public void setAccountBalance(Double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }
}
