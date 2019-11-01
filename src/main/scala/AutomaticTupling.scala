object AutomaticTupling {
  def start() = {
    val xs: List[(Int, Int)] = List((1,2))
    xs map {
      case (x, y) => x + y
    }
    xs.map {
      (x, y) => x + y
    }
    xs.map(_ + _)

    val ys = List(Hoge(1,2))
    ys map {
      case Hoge(x, y) => x + y
    }
    ys.map {
      (x, y) ⇒ x + y
    }
    ys.map(_ + _)

    List(Fuga(1,Piyo(2,3))).map {
      case Fuga(x, Piyo(y, z)) ⇒ x + y + z
    }
    "start new AutomaticTupling"
  }
}
case class Hoge(x:Int,y:Int)
case class Fuga(x:Int,y:Piyo)
case class Piyo(x:Int,y:Int)