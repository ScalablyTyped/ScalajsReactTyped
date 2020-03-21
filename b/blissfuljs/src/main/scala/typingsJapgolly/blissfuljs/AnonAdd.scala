package typingsJapgolly.blissfuljs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  def add(name: String, callback: js.Function): Unit
  def run(name: String, env: js.Object): Unit
}

object AnonAdd {
  @scala.inline
  def apply(add: (String, js.Function) => Callback, run: (String, js.Object) => Callback): AnonAdd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => add(t0, t1).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => run(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAdd]
  }
}

