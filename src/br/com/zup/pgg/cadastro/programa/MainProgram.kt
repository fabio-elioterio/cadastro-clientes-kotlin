package br.com.zup.pgg.cadastro.programa

import br.com.zup.pgg.cadastro.client.Client

class MainProgram {

    var map: HashMap<Long, Client> = hashMapOf()

    fun clientInsert() {
        println("Digite o nome do cliente: ")
        var name: String = readLine()!!.toString()
        println("Digite o CPF do cliente: ")
        var cpf: Long = readLine()!!.toLong()
        println("Digite a idade do cliente: ")
        var age: Int = readLine()!!.toInt()
        println("Digite o email do cliente: ")
        var email: String = readLine()!!.toString()
        println("Digite o telefone do cliente:")
        var telephone: String = readLine()!!.toString()
        println("Digite o endereço do cliente: ")
        var address: String = readLine()!!.toString()

        var clientInserts = Client(name, cpf, age, email, telephone, address)

        map.put(cpf, clientInserts)

    }
}

fun main() {

    var mainProgram = MainProgram()

    mainProgram.clientInsert()

}