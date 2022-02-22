import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 1,
            endereco = Endereco(logradouro = "rua vergueiro")
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome= "Fran", cpf= "", senha= 2),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.1)

    println("Nome conta corrente: ${contaCorrente.titular.nome}")
    println("Endereço conta corrente: ${contaCorrente.titular.endereco.logradouro}")
    println("saldo corrente: ${contaCorrente.saldo}")
    println("nome conta poupança: ${contaCorrente.titular.nome}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo apos saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança apos receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(700.0, contaCorrente)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança apos receber transferencia: ${contaPoupanca.saldo}")
}
