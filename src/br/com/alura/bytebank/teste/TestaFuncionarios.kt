import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionario() {
    val alex = Gerente(
        nome = "Alex",
        cpf = "111.120.359-42",
        salario = 1000.00,
        senha = 1234
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.154.542-32",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-24",
        salario = 7000.0,
        senha = 4000,
        prl = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("total de bonificacao: ${calculadora.total}")
}

