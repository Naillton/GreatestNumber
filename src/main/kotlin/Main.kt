import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Informe o primeiro numero: ")
    val firstNumber: Int = sc.nextInt()
    print("Informe o segundo numero: ")
    val secondNumber: Int = sc.nextInt()
    print("Informe o terceiro numero: ")
    val thirdNumber: Int = sc.nextInt()
    if (firstNumber > secondNumber && firstNumber > thirdNumber) {
        println("$firstNumber é o maior numero")
    } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
        println("$secondNumber é o maior numero")
    } else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
        println("$thirdNumber é o maior numero")
    } else {
        println("Existem numeros iguais")
    }
    sc.close()
}