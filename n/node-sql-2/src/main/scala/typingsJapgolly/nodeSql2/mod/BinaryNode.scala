package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryNode extends js.Object {
  def and(node: BinaryNode): BinaryNode
  def or(node: BinaryNode): BinaryNode
}

object BinaryNode {
  @scala.inline
  def apply(and: BinaryNode => CallbackTo[BinaryNode], or: BinaryNode => CallbackTo[BinaryNode]): BinaryNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.nodeSql2.mod.BinaryNode) => and(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.nodeSql2.mod.BinaryNode) => or(t0).runNow()))
    __obj.asInstanceOf[BinaryNode]
  }
}

