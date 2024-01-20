package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T08 extends FunSuite {

  test("genTrees4 のテスト") {

    val ts = Ticket.genTrees4(1,2,3,4).map(_.toString).toSet
    val as = jp.kobe_u.Ticket.genTrees4(1,2,3,4).map(_.toString).toSet

    assert(
        ts == as
    )
  }

}
