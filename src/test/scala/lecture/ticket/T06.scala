package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T06 extends FunSuite {

  test("genTrees2 のテスト") {

    val ts = Ticket.genTrees2(1,2).map(_.toString).toSet
    val as = jp.kobe_u.Ticket.genTrees2(1,2).map(_.toString).toSet

    assert(
        ts == as
    )
  }

}
