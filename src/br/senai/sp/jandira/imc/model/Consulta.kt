package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {

    var dataConsulta: LocalDate? = null
    var horaConsulta: LocalTime? = null
    var medico: Medico? = null
    var paciente: Paciente? = null
    private var valor: Double? = 0.0

    fun marcarConsulta(valor: Double, of: LocalDate){
        if (valor < 0){
            println("O valor da consulta deve ser maior que zero!")
        }else{
            this.valor =valor
        }
        this.dataConsulta = dataConsulta

    }


}