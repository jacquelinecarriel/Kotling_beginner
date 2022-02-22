package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val prl: Double

): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha= senha
) {

    override val bonificacao: Double
        get(){
            return salario
    }

//    override fun autentica(senha: Int): Boolean {
//        return autentica(senha)
//    }
}