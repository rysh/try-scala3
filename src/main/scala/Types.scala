object Types {
	def start():String = {
		val msg = "start new types"
		println(msg)
    hoge(A(1))
    hoge(B(2))
    println(hoge2().getClass)
    fuga(new E())
		msg
	}

	case class A( x: Int) {}
	case class B( x: Int) {}
  trait C {
    def hoge() = "hoge"
  }
  trait D {
    def fuga() = "fuga"
  }
  class E extends C with D
  def hoge(x: A | B): Unit = {
    println(x.getClass)
    //println(x.x) // value `x` is not a member of Types.A | Types.B
    val a = x match {
      case A(s) => s
      case B(s) => s
    }
    println("hoge1:" + a)
  }
  // あってもコンパイルエラーにならない。
  // 呼び出しはこっちが優先される
  // def hoge(x: B): Unit = {
//    println("hoge3:" + x.x)
//  }

  def hoge2(): Int | String = {
    if (true) 1 else "1" // else 0.0
  }
  def fuga(x: C & D): Unit = {
    x.hoge()
    x.fuga()
  }
}
