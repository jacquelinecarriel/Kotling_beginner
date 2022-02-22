import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome= "Alex", cpf = "", senha=1)
    val contaAlex = ContaCorrente(titular= alex, numero = 5000)
    contaAlex.deposita(300.00)

    val fran = Cliente(nome="fran", cpf="", senha=2)
    val contaFran = ContaPoupanca(numero=1500 , titular= fran)
    contaFran.deposita(500.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("transferencia da conta da Fran para o Alex")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
