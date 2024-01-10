package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T05 extends FunSuite {

  test("toString のテスト") {

    val t1 = (Node("/", Leaf(8), Node("-", Leaf(1), Node("/", Leaf(1), Leaf(5)))))
    val t2 = (SNode("/", SLeaf(8), SNode("-", SLeaf(1), SNode("/", SLeaf(1), SLeaf(5)))))

    assert(
        t1.toString == t2.toString
    )
  }

}
