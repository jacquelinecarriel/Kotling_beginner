package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import testaContasDiferentes


fun testaObjects(){

    val fran = object: Autenticavel {
        val nome: String = "fran"
        val cpf: String = "111.111-11"
        val senha: Int =1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("nome do cliente ${fran.nome}")

    val alex = Cliente(nome= "alex", cpf = "", senha=1)
    val contaPoupanca= ContaPoupanca(titular = alex, numero = 1000)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}
