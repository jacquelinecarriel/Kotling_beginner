import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")
    try{
        10/2
    } catch (e:ArithmeticException){
        println("AritmeticException foi pegada")
    }
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("inicio funcao1")
    try{
        funcao2()
    } catch (e:ClassCastException){

    }
    println("fim funcao1")
}

fun funcao2(){
    println("inicio funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
            endereco as Endereco
        }
    println("fim funcao2")
}

