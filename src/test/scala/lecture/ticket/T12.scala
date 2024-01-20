package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T12 extends FunSuite {

  test("enumDifficult(9) のテスト") {

    val t09 = Ticket.enumDifficult(9).toSet
    val a09 = jp.kobe_u.Ticket.enumDifficult(4,9).toSet

    val t10 = Ticket.enumDifficult(10).toSet
    val a10 = jp.kobe_u.Ticket.enumDifficult(4,10).toSet

    val t11 = Ticket.enumDifficult(11).toSet
    val a11 = jp.kobe_u.Ticket.enumDifficult(4,11).toSet

    val t12 = Ticket.enumDifficult(12).toSet
    val a12 = jp.kobe_u.Ticket.enumDifficult(4,12).toSet

    assert(
      t09 == a09
    )
  }

  test("enumDifficult(10) のテスト") {

    val t10 = Ticket.enumDifficult(10).toSet
    val a10 = jp.kobe_u.Ticket.enumDifficult(4,10).toSet

    assert(
      t10 == a10
    )
  }

  test("enumDifficult(11) のテスト") {

    val t11 = Ticket.enumDifficult(11).toSet
    val a11 = jp.kobe_u.Ticket.enumDifficult(4,11).toSet

    assert(
      t11 == a11
    )
  }

}
