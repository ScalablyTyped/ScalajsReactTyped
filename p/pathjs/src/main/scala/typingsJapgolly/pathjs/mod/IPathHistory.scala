package typingsJapgolly.pathjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathHistory extends js.Object {
  var initial: js.Any
  def listen(fallback: js.Any): Unit
  def popState(event: js.Any): Unit
  def pushState(state: js.Any, title: String, path: String): Unit
}

object IPathHistory {
  @scala.inline
  def apply(
    initial: js.Any,
    listen: js.Any => Callback,
    popState: js.Any => Callback,
    pushState: (js.Any, String, String) => Callback
  ): IPathHistory = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: js.Any) => listen(t0).runNow()))
    __obj.updateDynamic("popState")(js.Any.fromFunction1((t0: js.Any) => popState(t0).runNow()))
    __obj.updateDynamic("pushState")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: java.lang.String) => pushState(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IPathHistory]
  }
}

