package typingsJapgolly.istanbulLibReport.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N
  def visit(visitor: Partial[Visitor[N]], state: js.Any): Unit
}

object Tree {
  @scala.inline
  def apply[N /* <: Node */](getRoot: CallbackTo[N], visit: (Partial[Visitor[N]], js.Any) => Callback): Tree[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRoot")(getRoot.toJsFn)
    __obj.updateDynamic("visit")(js.Any.fromFunction2((t0: typingsJapgolly.std.Partial[typingsJapgolly.istanbulLibReport.mod.Visitor[N]], t1: js.Any) => visit(t0, t1).runNow()))
    __obj.asInstanceOf[Tree[N]]
  }
}

