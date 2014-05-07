object ex3 {

  object p1 {
    // 1
    val n = 10
    val a = new Array[Int](n)
    for (i <- 0 until a.length) a(i) = (math.random * n).toInt
  }

  object p2 {
    // 2
    val a = Array(1, 2, 3, 4, 5)
    for (i <- 0 until a.length by 2) {
      if (i + 1 < a.length) {
        val t = a(i)
        a(i) = a(i + 1)
        a(i + 1) = t
      }
    }
  }

  object p3 {
    // 3
    val n = 9
    val a = new Array[Int](n)
    for (i <- 0 until a.length) a(i) = (math.random * n).toInt

    val b = for (i <- 0 until a.length) yield {
      if (i % 2 == 0) {
        if (i + 1 < a.length) a(i + 1)
        else a(i)
      } else a(i - 1)
    }
  }

  object p4 {
    // 4
    val a = Array(1, 3, -2, 4, 0, 9, -3, 1, 0, -3)
    // result : Array(1, 3, 4, 9, 1, -2, 0, -3, 0, -3)
    val pos_idx = for (i <- 0 until a.length if a(i) > 0) yield i
    val nz_idx = for (i <- 0 until a.length if a(i) <= 0) yield i
    val bf = pos_idx ++: nz_idx
    val result = for (i <- 0 until bf.length) yield a(bf(i))
  }

  object p5 {
    // 5
    val a = Array[Double](1.2, 2.3, 4, 5.2)
    // average: 3.175
    val avg = a.reduce(_ + _) / a.length
  }

  object p6 {
    // 6
    val a = Array(1, 3, -2, 4, 0, 9, -3, 1, 0, -3)
    // array reverse sort
    a.sorted.reverse

    // ArrayBuffer reverse sort
    val b = a.toBuffer
    b.sorted.reverse
  }

  object p7 {
    // 7
    val a = Array(1, 3, -2, 4, 0, 9, -3, 1, 0, -3)
    a.distinct
  }

  object p8 {

    // 8
    val a = Array(1, 3, -2, 4, 0, 9, -3, 1, 0, -3).toBuffer
    val nidx = (for (i <- 0 until a.length if a(i) < 0) yield i).reverse.dropRight(1)
    for (i <- 0 until nidx.length) a.remove(nidx(i))
    // result: a => 1 3 -2 4 0 9 1 0
  }

  object p9 {
    // 9
    val prefix = "America/"
    java.util.TimeZone.getAvailableIDs.filter(_.startsWith(prefix)).map(_.stripPrefix(prefix))
  }

  object p10 {
    // 10
    import java.awt.datatransfer._
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    val image_flavors = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  }
}
