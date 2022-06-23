import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")
    testaComportamentosConta()
    println("fim main")
}

fun funcao1(){
    println("inicio funcao1")
    try{
        funcao2()
    } catch (e:ClassCastException){
        println(e.message)
        println(e.stackTrace)
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2(){
    println("inicio funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
            throw SaldoInsuficienteException()
        }
    println("fim funcao2")
}
