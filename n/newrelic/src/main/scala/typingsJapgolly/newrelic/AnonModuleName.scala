package typingsJapgolly.newrelic

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModuleName extends js.Object {
  var moduleName: String
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  def onRequire(): Unit
}

object AnonModuleName {
  @scala.inline
  def apply(moduleName: String, onRequire: Callback, onError: /* err */ js.Error => Callback = null): AnonModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any])
    __obj.updateDynamic("onRequire")(onRequire.toJsFn)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[AnonModuleName]
  }
}

