import scala.io.StdIn.readLine

object SumaNumerosApp {
  def main(args: Array[String]): Unit = {
    // Pedir el primer número al usuario
    print("Ingrese un número: ")
    val numero1 = readLine().toInt

    // Pedir el segundo número al usuario
    print("Ingrese otro número: ")
    val numero2 = readLine().toInt

    // Sumar los dos números
    val suma = numero1 + numero2

    // Imprimir el resultado
    println(s"La suma entre $numero1 y $numero2 es $suma")
  }
}
