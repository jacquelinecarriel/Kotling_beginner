package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

class testaPilha {

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


}