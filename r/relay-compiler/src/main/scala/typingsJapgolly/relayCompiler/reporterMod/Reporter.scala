package typingsJapgolly.relayCompiler.reporterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def reportError(caughtLocation: String, error: js.Error): Unit
  def reportMessage(message: String): Unit
  def reportTime(name: String, ms: Double): Unit
}

object Reporter {
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Callback,
    reportMessage: String => Callback,
    reportTime: (String, Double) => Callback
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reportError")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Error) => reportError(t0, t1).runNow()))
    __obj.updateDynamic("reportMessage")(js.Any.fromFunction1((t0: java.lang.String) => reportMessage(t0).runNow()))
    __obj.updateDynamic("reportTime")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => reportTime(t0, t1).runNow()))
    __obj.asInstanceOf[Reporter]
  }
}

