package typingsJapgolly.reactDndHtml5Backend.enterLeaveCounterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterLeaveCounter extends js.Object {
  var entered: js.Any
  var isNodeInDocument: js.Any
  def enter(enteringNode: js.Any): Boolean
  def leave(leavingNode: js.Any): Boolean
  def reset(): Unit
}

object EnterLeaveCounter {
  @scala.inline
  def apply(
    enter: js.Any => CallbackTo[Boolean],
    entered: js.Any,
    isNodeInDocument: js.Any,
    leave: js.Any => CallbackTo[Boolean],
    reset: Callback
  ): EnterLeaveCounter = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], isNodeInDocument = isNodeInDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("enter")(js.Any.fromFunction1((t0: js.Any) => enter(t0).runNow()))
    __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: js.Any) => leave(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[EnterLeaveCounter]
  }
}

