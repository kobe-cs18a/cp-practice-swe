package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T04 extends FunSuite {

  test("valueEquals のテスト") {
    val t1 = Node("*", Node("/", Leaf(1), Leaf(3)), Node("/", Leaf(7), Leaf(2)))
    val t2 = Node("-", Node("+", Node("/", Leaf(7), Leaf(6)), Leaf(1)), Leaf(1))
    assert(
      !(t1.value == t2.value) && 
      (t1.valueEquals(t2.value))
    )
  }

}
