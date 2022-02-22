import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-32",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Jacqueline",
        cpf = "125.458.648-32",
        salario = 1000.0,
        senha = 2000,
        prl = 200.0
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(diretor, 1234)

}