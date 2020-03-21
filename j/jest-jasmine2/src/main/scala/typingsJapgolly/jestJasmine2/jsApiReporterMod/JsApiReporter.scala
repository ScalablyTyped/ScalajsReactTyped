package typingsJapgolly.jestJasmine2.jsApiReporterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestJasmine2.specMod.SpecResult
import typingsJapgolly.jestJasmine2.suiteMod.SuiteResult
import typingsJapgolly.jestJasmine2.typesMod.Reporter
import typingsJapgolly.jestJasmine2.typesMod.RunDetails
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsApiReporter extends Reporter {
  var finished: Boolean
  var runDetails: RunDetails
  var started: Boolean
  def executionTime(): js.Any
  def specResults(index: Double, length: Double): js.Array[SpecResult]
  def specs(): js.Array[SpecResult]
  def status(): js.Any
  def suiteResults(index: Double, length: Double): js.Array[SuiteResult]
  def suites(): Record[String, SuiteResult]
}

object JsApiReporter {
  @scala.inline
  def apply(
    executionTime: CallbackTo[js.Any],
    finished: Boolean,
    jasmineDone: RunDetails => Callback,
    jasmineStarted: RunDetails => Callback,
    runDetails: RunDetails,
    specDone: SpecResult => Callback,
    specResults: (Double, Double) => CallbackTo[js.Array[SpecResult]],
    specStarted: SpecResult => Callback,
    specs: CallbackTo[js.Array[SpecResult]],
    started: Boolean,
    status: CallbackTo[js.Any],
    suiteDone: SuiteResult => Callback,
    suiteResults: (Double, Double) => CallbackTo[js.Array[SuiteResult]],
    suiteStarted: SuiteResult => Callback,
    suites: CallbackTo[Record[String, SuiteResult]]
  ): JsApiReporter = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], runDetails = runDetails.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("executionTime")(executionTime.toJsFn)
    __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineDone(t0).runNow()))
    __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineStarted(t0).runNow()))
    __obj.updateDynamic("specDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specDone(t0).runNow()))
    __obj.updateDynamic("specResults")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => specResults(t0, t1).runNow()))
    __obj.updateDynamic("specStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specStarted(t0).runNow()))
    __obj.updateDynamic("specs")(specs.toJsFn)
    __obj.updateDynamic("status")(status.toJsFn)
    __obj.updateDynamic("suiteDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteDone(t0).runNow()))
    __obj.updateDynamic("suiteResults")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => suiteResults(t0, t1).runNow()))
    __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteStarted(t0).runNow()))
    __obj.updateDynamic("suites")(suites.toJsFn)
    __obj.asInstanceOf[JsApiReporter]
  }
}

