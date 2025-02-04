package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate

fun main(){

    //Criacao do medico

    var medico = Medico()
    var medico1 = Medico()
    var medico2 = Medico()

//preenchendo os dados do medico
    medico.nome = "Ana Maria"
    medico.crm = "111111"
    medico.telefone = "(11) 74887-6777"
    medico.especialidades.add("Nutricionista")
    medico.especialidades.add("Gastroenterologista")
    medico.mostrarFichaDoMedico()


    medico1.nome = "Miguel Figueira"
    medico1.crm = "2222222"
    medico1.telefone = "(11) 999766-5555"
    medico1.especialidades.addAll(listOf("Cardiologista","Otorrinolaringologista","Clínico Geral"))
    medico1.mostrarFichaDoMedico()



    var paciente1 = Paciente()
    var paciente2 = Paciente()


    paciente1.nome = "Patricia"
    paciente1.peso = 78
    paciente1.altura = 1.61f

    paciente1.telefone = "(11)97777-6050"
    paciente1.dataNascimento = LocalDate.of(2003, 8,13)
    paciente1.mostrarDados()

    paciente2.nome = "celso "
    paciente2.peso = 70
    paciente2.altura = 1.70f
    paciente2.telefone = "(11)97777-6050"
    paciente2.dataNascimento = LocalDate.of(2003, 8,13)
    paciente2.mostrarDados()


    // criar uma consulta para o paciente 1

    var c1 = Consulta()
    c1.marcarConsulta(100.0, LocalDate.of(2025, 2, 21))

}
