package typingsJapgolly.istanbulLibReport.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def isRoot(): Boolean
  def visit(visitor: Visitor[Node], state: js.Any): Unit
}

object Node {
  @scala.inline
  def apply(isRoot: CallbackTo[Boolean], visit: (Visitor[Node], js.Any) => Callback): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRoot")(isRoot.toJsFn)
    __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: typingsJapgolly.istanbulLibReport.mod.Visitor[typingsJapgolly.istanbulLibReport.mod.Node], t1: js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[Node]
  }
}

