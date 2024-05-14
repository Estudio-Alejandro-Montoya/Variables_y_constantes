val list = List(1, 3, 34, 34, 45, 5, 32, 5, 56, 54, 34, 34, 3, 4, 4, 3, 3, 3, 3, 4, 4, 5, 5, 4, 4, 3, 3, 2, 3)
  var ind = 0
  for (num <- list) {
    if (num == 34) {
      println(ind)}
    else {
      ind = ind + 1
    }
  }
  println("no está")