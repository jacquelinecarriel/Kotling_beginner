import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroY $numeroY")
        println("numeroX $numeroX")

        val joao = Cliente(nome = "João", cpf="" , senha= 1)

        val contaJoao = ContaCorrente(joao, 1002)
        contaJoao.titular.nome = "Joao"

        val contaMaria = ContaPoupanca(Cliente(
                nome = "Maria",
                cpf = "",
                senha = 2
        ),  1003)
        contaMaria.titular.nome = "Maria"
        contaJoao.titular.nome= "Joao"

        println("titular conta Joao: ${contaJoao.titular}")
        println("titular conta Maria: ${contaMaria.titular}")
        println(contaJoao)
    }
