object Main extends App {
  // Función para verificar si un número es par
  def esPar(num: Int): Boolean = num % 2 == 0
  
  // Función para filtrar números pares de una lista
  def numerosPares(lista: List[Int]): List[Int] = lista.filter(esPar)
  
  // Ejemplo de uso
  val listaNumeros = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val pares = numerosPares(listaNumeros)
  
  println("Números pares en la lista: " + pares.mkString(", "))
}
