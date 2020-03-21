package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiReporter extends Reporter {
  def addReporter(reporter: Reporter): Unit
}

object MultiReporter {
  @scala.inline
  def apply(
    addReporter: Reporter => Callback,
    log: String => Callback,
    reportRunnerResults: Runner => Callback,
    reportRunnerStarting: Runner => Callback,
    reportSpecResults: Spec => Callback,
    reportSpecStarting: Spec => Callback,
    reportSuiteResults: Suite => Callback
  ): MultiReporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addReporter")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Reporter) => addReporter(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("reportRunnerResults")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Runner) => reportRunnerResults(t0).runNow()))
    __obj.updateDynamic("reportRunnerStarting")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Runner) => reportRunnerStarting(t0).runNow()))
    __obj.updateDynamic("reportSpecResults")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Spec) => reportSpecResults(t0).runNow()))
    __obj.updateDynamic("reportSpecStarting")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Spec) => reportSpecStarting(t0).runNow()))
    __obj.updateDynamic("reportSuiteResults")(js.Any.fromFunction1((t0: typingsJapgolly.jasmine.jasmine.Suite) => reportSuiteResults(t0).runNow()))
    __obj.asInstanceOf[MultiReporter]
  }
}

