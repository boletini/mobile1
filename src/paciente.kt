import java.time.LocalDate
import java.time.Period
import kotlin.math.pow
// classe paciente
//programador: beatriz boletini
//data: 04/02/2025

class Paciente {
    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Float = 0.0f
    var telefone: String = ""


    fun calcularImc(): Float{
        var imc = peso / altura.pow(2)
        return imc
    }

    fun mostrarDados(){
        println("dados do paciente")
        println("------------------------ ")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("classificacao: ${classificarImc()}")
        println("-------------------------")



    }
    fun classificarImc(): String {
        val imc = calcularImc()
        var classificacao = ""

        if (imc <= 18.5){
            classificacao = "abaixo do preco"
        } else if (imc > 18.5 && imc < 25.0){
            classificacao = "peso ideal"
        }
        return classificacao
    }
    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        return idade
    }
}
