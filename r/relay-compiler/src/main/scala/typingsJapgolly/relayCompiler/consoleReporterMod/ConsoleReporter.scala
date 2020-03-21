package typingsJapgolly.relayCompiler.consoleReporterMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayCompiler.reporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleReporter extends Reporter

object ConsoleReporter {
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Callback,
    reportMessage: String => Callback,
    reportTime: (String, Double) => Callback
  ): ConsoleReporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reportError")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Error) => reportError(t0, t1).runNow()))
    __obj.updateDynamic("reportMessage")(js.Any.fromFunction1((t0: java.lang.String) => reportMessage(t0).runNow()))
    __obj.updateDynamic("reportTime")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => reportTime(t0, t1).runNow()))
    __obj.asInstanceOf[ConsoleReporter]
  }
}

