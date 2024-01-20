package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T08 extends FunSuite {

  test("genTrees4 のテスト") {

    val ts = Ticket.genTrees4(1,2,3,4)
    val as = jp.kobe_u.Ticket.genTrees4(1,2,3,4)

    assert(
        ts.size == as.size &&
        (0 until ts.size).forall(i => ts(i).value == as(i).value)
    )
  }

}
