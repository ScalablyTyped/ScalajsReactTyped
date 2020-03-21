package typingsJapgolly.apostrophe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposModule extends js.Object {
  def emit(name: String): Unit
  def on(name: String, methodName: js.Any, fn: js.Function0[_]): Unit
}

object AposModule {
  @scala.inline
  def apply(emit: String => Callback, on: (String, js.Any, js.Function0[js.Any]) => Callback): AposModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction1((t0: java.lang.String) => emit(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function0[js.Any]) => on(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AposModule]
  }
}

