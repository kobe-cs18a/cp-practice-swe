package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T10 extends FunSuite {

  test("countAllYesInstances(9) のテスト") {

    val t09 = Ticket.countAllYesInstances(9)
    val a09 = jp.kobe_u.Ticket.countAllYesInstances(9)

    assert(
        t09 == a09
    )
  }

  test("countAllYesInstances(10) のテスト") {

    val t10 = Ticket.countAllYesInstances(10)
    val a10 = jp.kobe_u.Ticket.countAllYesInstances(10)

    assert(
        t10 == a10
    )
  }

  test("countAllYesInstances(11) のテスト") {

    val t11 = Ticket.countAllYesInstances(11)
    val a11 = jp.kobe_u.Ticket.countAllYesInstances(11)

    assert(
        t11 == a11 
    )
  }

}
