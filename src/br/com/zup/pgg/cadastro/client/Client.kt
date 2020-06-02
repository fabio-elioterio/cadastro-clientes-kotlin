package br.com.zup.pgg.cadastro.client

class Client {

    var name: String = ""
    var cpf: Long = 0
    var age: Int = 0
    var email: String = ""
    var telephone: String = ""
    var address: String = ""

    constructor() {}

    constructor(name: String, cpf: Long, age: Int, email: String, telephone: String, address: String) {
        this.name = name
        this.cpf = cpf
        this.age = age
        this.email = email
        this.telephone = telephone
        this.address = address
    }


}