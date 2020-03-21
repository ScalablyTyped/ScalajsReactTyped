package typingsJapgolly.jestJasmine2.reportDispatcherMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jestJasmine2.specMod.SpecResult
import typingsJapgolly.jestJasmine2.suiteMod.SuiteResult
import typingsJapgolly.jestJasmine2.typesMod.Reporter
import typingsJapgolly.jestJasmine2.typesMod.RunDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDispatcher extends Reporter {
  def addReporter(reporter: Reporter): Unit
  def clearReporters(): Unit
  def provideFallbackReporter(reporter: Reporter): Unit
}

object ReportDispatcher {
  @scala.inline
  def apply(
    addReporter: Reporter => Callback,
    clearReporters: Callback,
    jasmineDone: RunDetails => Callback,
    jasmineStarted: RunDetails => Callback,
    provideFallbackReporter: Reporter => Callback,
    specDone: SpecResult => Callback,
    specStarted: SpecResult => Callback,
    suiteDone: SuiteResult => Callback,
    suiteStarted: SuiteResult => Callback
  ): ReportDispatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addReporter")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.Reporter) => addReporter(t0).runNow()))
    __obj.updateDynamic("clearReporters")(clearReporters.toJsFn)
    __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineDone(t0).runNow()))
    __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineStarted(t0).runNow()))
    __obj.updateDynamic("provideFallbackReporter")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.Reporter) => provideFallbackReporter(t0).runNow()))
    __obj.updateDynamic("specDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specDone(t0).runNow()))
    __obj.updateDynamic("specStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specStarted(t0).runNow()))
    __obj.updateDynamic("suiteDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteDone(t0).runNow()))
    __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteStarted(t0).runNow()))
    __obj.asInstanceOf[ReportDispatcher]
  }
}

