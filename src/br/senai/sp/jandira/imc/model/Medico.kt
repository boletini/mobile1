package br.senai.sp.jandira.imc.model

class Medico {
    var nome: String = ""
    var especialidades: ArrayList<String> = ArrayList()
    var crm: String = ""
    var telefone: String = ""

    fun mostrarFichaDoMedico(){
        println("-----------")
        println("---|FICHA DO MËDICO------")
        println("+-----------")
        println("---|NOME: $nome---------")
        println("---|TEL: $telefone------")
        println("---|CRM: $crm---------")
        println("---ESPECIALIDADES:----")

        for (especialidade in especialidades){
            println(especialidade)
        }
            println("+-----------------+")
    }
}