package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterParameters[Params /* <: js.Object */] extends js.Object {
  var callbackParameters: Params
  def callback(cell: js.Any, params: Params): Boolean
}

object CustomFilterParameters {
  @scala.inline
  def apply[Params /* <: js.Object */](callback: (js.Any, Params) => CallbackTo[Boolean], callbackParameters: Params): CustomFilterParameters[Params] = {
    val __obj = js.Dynamic.literal(callbackParameters = callbackParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: js.Any, t1: Params) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[CustomFilterParameters[Params]]
  }
}

