object InlineExample {
  def hoge() = {
     (0 to 100).foreach(s => {
       
      // val start = System.currentTimeMillis
      // (0 to 10000000).foreach(x => fuga1(1.0))
      // val end = System.currentTimeMillis

      // val start2 = System.currentTimeMillis
      // (0 to 10000000).foreach(x => fuga2(1.0))
      // val end2 = System.currentTimeMillis
      // println("normal|inline:" + (end - start) + "|" +(end2 - start2))
      
     })
  }
  def fuga1(x: Double) = {
    x + 1
  }

  inline def fuga2(x: Double) = {
    x + 1
  }

}