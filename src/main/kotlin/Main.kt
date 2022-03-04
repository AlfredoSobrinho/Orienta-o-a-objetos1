fun main(args: Array<String>) {
    /*

    4) Crie uma classe funcionário e apresente os
    atributos e métodos referentes esta classe, em seguida crie um objeto
    funcionário, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
 */

    val marcio = Funcionario()

    marcio.nome="Marcio"
    marcio.codfunci=19
    marcio.endereco = "rua dois, 300"
    marcio.email = "marcio19@gmail.com"
    marcio.sexo = "masculino"
    marcio.telefone = 20004455


    println("Nome - ${marcio.nome}")
    println("Codigo do funcionario - ${marcio.codfunci}")
    println("Endereço - ${marcio.endereco}")
    println("E-mail - ${marcio.email}")
    println("Sexo - ${marcio.sexo}")
    println("Telefone - ${marcio.telefone}")




    val func = FunMet()

    func.funcao = "tapeceiro"
    func.Hetrabalhadas = 10
    func.salario = 1800.0
     println("\n")


    func.inffunci()







}
