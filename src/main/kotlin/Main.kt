fun main(args: Array<String>) {

    print("Qual a sua idade? ")
    var idade = readLine()!!.toInt()

    var precoIngresso = 18.0
    var desconto = 0.0
    var valorFinal = 0.0
    var quant = 0


    if (idade < 5){
        desconto = (precoIngresso * 60) / 100.0
        valorFinal = precoIngresso - desconto
        println("O valor do ingresso é: R$$valorFinal")
    }else if(idade > 60){
        desconto = (precoIngresso * 55) /100.0
        valorFinal = precoIngresso - desconto
        println("O valor do ingresso é: R$$valorFinal")
    }else{
        println("O valor do ingresso é: R$$precoIngresso")
    }

        print("Quantos ingressos você vai querer? ")
        quant = readLine()!!.toInt()

    if (quant >= 2){
        desconto = (precoIngresso * 30) / 100.0
        valorFinal = (precoIngresso - desconto) * quant
        println("Você comprou $quant ingressos, e pagará: R$$valorFinal")
    }

    println("Muito obrigado! Bom Filme! ")

}