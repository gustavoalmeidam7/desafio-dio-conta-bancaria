package ContaBanco;

import ContaBanco.service.BankAccount;
import ContaBanco.util.UserConsole;

public class Program {
    public static void main(String[] args) throws Exception {
        UserConsole.writeLine("Digite o número da conta (Ex: 9999):");
        int accountNumber = Integer.parseInt(UserConsole.readLine());

        UserConsole.writeLine("Digite o número da agencia (Ex: 999-9):");
        String agencyNumber = UserConsole.readLine();

        UserConsole.writeLine("Digite o nome do cliente (Ex: Jalin habbey de costa):");
        String customerName = UserConsole.readLine();

        UserConsole.writeLine("Digite o saldo da conta (Ex: 69.69):");
        Double accountBalance = Double.parseDouble(UserConsole.readLine());

        BankAccount userBankAccount = new BankAccount(accountNumber, agencyNumber, customerName, accountBalance);

        UserConsole.writeLine(userBankAccount.getAccountInfo());
    }
}