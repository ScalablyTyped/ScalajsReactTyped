package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def log(str: String): Unit
  def reportRunnerResults(runner: Runner): Unit
  def reportRunnerStarting(runner: Runner): Unit
  def reportSpecResults(spec: Spec): Unit
  def reportSpecStarting(spec: Spec): Unit
  def reportSuiteResults(suite: Suite): Unit
}

object Reporter {
  @scala.inline
  def apply(
    log: String => Callback,
    reportRunnerResults: Runner => Callback,
    reportRunnerStarting: Runner => Callback,
    reportSpecResults: Spec => Callback,
    reportSpecStarting: Spec => Callback,
    reportSuiteResults: Suite => Callback
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("reportRunnerResults")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Runner) => reportRunnerResults(t0).runNow()))
    __obj.updateDynamic("reportRunnerStarting")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Runner) => reportRunnerStarting(t0).runNow()))
    __obj.updateDynamic("reportSpecResults")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Spec) => reportSpecResults(t0).runNow()))
    __obj.updateDynamic("reportSpecStarting")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Spec) => reportSpecStarting(t0).runNow()))
    __obj.updateDynamic("reportSuiteResults")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Suite) => reportSuiteResults(t0).runNow()))
    __obj.asInstanceOf[Reporter]
  }
}

