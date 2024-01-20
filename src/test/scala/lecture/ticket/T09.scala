package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T09 extends FunSuite {

  test("findSolutions4(9,8,8,1,10) のテスト") {

    val ts = Ticket.findSolutions4(9,8,8,1,10).map(_.toString()).toSet
    val as = jp.kobe_u.Ticket.findSolutions4(9,8,8,1,10).map(_.toString).toSet

    assert(
        ts == as
    )
  }

  test("findSolutions4(7,1,3,1,10) のテスト") {

    val ts = Ticket.findSolutions4(7,1,3,1,10).map(_.toString()).toSet
    val as = jp.kobe_u.Ticket.findSolutions4(7,1,3,1,10).map(_.toString).toSet

    assert(
        ts.size == as.size &&
        ts.forall(t => as.contains(t))
    )
  }


}
