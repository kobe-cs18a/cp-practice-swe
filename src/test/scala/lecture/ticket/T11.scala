package lecture.ticket

import org.scalatest.FunSuite
import org.scalatest.Reporter

import jp.kobe_u.{Tree => STree}
import jp.kobe_u.{Leaf => SLeaf}
import jp.kobe_u.{Node => SNode}

class T11 extends FunSuite {

  test("genTrees(Seq(1,2,3)) のテスト") {

    val t3 = Ticket.genTrees(Seq(1,2,3)).map(_.toString()).toSet
    val a3 = jp.kobe_u.Ticket.genTrees(Seq(1,2,3)).map(_.toString()).toSet

    assert(
        t3 == a3
    )
  }

  test("genTrees(Seq(1,2,3,4)) のテスト") {

    val t4 = Ticket.genTrees(Seq(1,2,3,4)).map(_.toString()).toSet
    val a4 = jp.kobe_u.Ticket.genTrees(Seq(1,2,3,4)).map(_.toString()).toSet

    assert(
        t4 == a4
    )
  }

  test("genTrees(Seq(1,2,3,4,5)) のテスト") {

    val t5 = Ticket.genTrees(Seq(1,2,3,4,5)).map(_.toString()).toSet
    val a5 = jp.kobe_u.Ticket.genTrees(Seq(1,2,3,4,5)).map(_.toString()).toSet


    assert(
        t5 == a5
    )
  }

}
