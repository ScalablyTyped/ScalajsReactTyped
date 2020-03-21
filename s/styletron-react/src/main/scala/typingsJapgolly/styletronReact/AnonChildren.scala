package typingsJapgolly.styletronReact

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.styletronReact.mod.DebugEngine
import typingsJapgolly.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): Node
}

object AnonChildren {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => CallbackTo[Node]): AnonChildren = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction3((t0: typingsJapgolly.styletronStandard.mod.StandardEngine, t1: typingsJapgolly.styletronReact.mod.DebugEngine, t2: scala.Boolean) => children(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonChildren]
  }
}

