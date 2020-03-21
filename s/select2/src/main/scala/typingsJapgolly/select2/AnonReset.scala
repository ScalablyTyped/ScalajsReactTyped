package typingsJapgolly.select2

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def reset(): Unit
  def set(key: String, value: js.Any): Unit
}

object AnonReset {
  @scala.inline
  def apply(reset: Callback, set: (String, js.Any) => Callback): AnonReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[AnonReset]
  }
}

