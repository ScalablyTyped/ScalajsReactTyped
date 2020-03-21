package typingsJapgolly.jestCore.reporterDispatcherMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.typesMod.Reporter
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestRunner.mod.Test
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterDispatcher extends js.Object {
  var _reporters: js.Any
  def getErrors(): js.Array[js.Error]
  def hasErrors(): Boolean
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit]
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit]
  def onTestResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit]
  def onTestStart(test: Test): js.Promise[Unit]
  def register(reporter: Reporter): Unit
  def unregister(ReporterClass: js.Function): Unit
}

object ReporterDispatcher {
  @scala.inline
  def apply(
    _reporters: js.Any,
    getErrors: CallbackTo[js.Array[js.Error]],
    hasErrors: CallbackTo[Boolean],
    onRunComplete: (Set[Context], AggregatedResult) => CallbackTo[js.Promise[Unit]],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => CallbackTo[js.Promise[Unit]],
    onTestResult: (Test, TestResult, AggregatedResult) => CallbackTo[js.Promise[Unit]],
    onTestStart: Test => CallbackTo[js.Promise[Unit]],
    register: Reporter => Callback,
    unregister: js.Function => Callback
  ): ReporterDispatcher = {
    val __obj = js.Dynamic.literal(_reporters = _reporters.asInstanceOf[js.Any])
    __obj.updateDynamic("getErrors")(getErrors.toJsFn)
    __obj.updateDynamic("hasErrors")(hasErrors.toJsFn)
    __obj.updateDynamic("onRunComplete")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.jestRuntime.mod.Context], t1: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onRunComplete(t0, t1).runNow()))
    __obj.updateDynamic("onRunStart")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => onRunStart(t0, t1).runNow()))
    __obj.updateDynamic("onTestResult")(js.Any.fromFunction3((t0: typingsJapgolly.jestRunner.mod.Test, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestResult(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTestStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestRunner.mod.Test) => onTestStart(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Reporter) => register(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: js.Function) => unregister(t0).runNow()))
    __obj.asInstanceOf[ReporterDispatcher]
  }
}

