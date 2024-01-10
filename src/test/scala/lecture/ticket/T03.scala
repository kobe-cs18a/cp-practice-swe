package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T03 extends FunSuite {

  test("value のテスト") {

    val t1 = Node("+", Leaf(8), Leaf(6))
    val t2 = Node("-", Leaf(8), Leaf(6))
    val t3 = Node("*", Leaf(8), Leaf(6))
    val t4 = Node("/", Leaf(8), Leaf(6))

    val a1 = SNode("+", SLeaf(8), SLeaf(6))
    val a2 = SNode("-", SLeaf(8), SLeaf(6))
    val a3 = SNode("*", SLeaf(8), SLeaf(6))
    val a4 = SNode("/", SLeaf(8), SLeaf(6))

    val t = Seq(t1, t2, t3, t4)
    val a = Seq(a1, a2, a3, a4)

    assert(
      (0 to 3).forall(i => t(i).value == a(i).value)
    )
  }

}
