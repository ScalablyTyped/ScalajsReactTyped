package typingsJapgolly.storybookClientApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearUnused extends js.Object {
  def clearUnused(): Unit
  def markAllAsUnused(): Unit
  def register(subscribe: js.Function0[Unit]): Unit
}

object AnonClearUnused {
  @scala.inline
  def apply(clearUnused: Callback, markAllAsUnused: Callback, register: js.Function0[Unit] => Callback): AnonClearUnused = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearUnused")(clearUnused.toJsFn)
    __obj.updateDynamic("markAllAsUnused")(markAllAsUnused.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => register(t0).runNow()))
    __obj.asInstanceOf[AnonClearUnused]
  }
}

