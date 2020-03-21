package typingsJapgolly.wordpressPriorityQueue

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  def add(context: js.Object, callback: js.Function0[Unit]): Unit
  def flush(context: js.Object): Boolean
}

object AnonAdd {
  @scala.inline
  def apply(add: (js.Object, js.Function0[Unit]) => Callback, flush: js.Object => CallbackTo[Boolean]): AnonAdd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: js.Object, t1: js.Function0[scala.Unit]) => add(t0, t1).runNow()))
    __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: js.Object) => flush(t0).runNow()))
    __obj.asInstanceOf[AnonAdd]
  }
}

