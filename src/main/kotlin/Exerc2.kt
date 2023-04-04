fun main(){
    var variavel: Int = 10
    val constante: Int = 5
    print("As variáveis recebem a palavra-chave var" + "\n As variáveis podem ter seu valor alterado após ou durante sua execução")
    print("As constantes recebem a palavra chave val" + "\n constantes não podem ter seu valor alternado")

    println("/nVariável $variavel")
    variavel = 2
    println("Variável atualizada $variavel")
    println("Constante $constante")
    println("Se tentarmos alterar o valor de uma constante o Kotlin apresenta um erro")
}
