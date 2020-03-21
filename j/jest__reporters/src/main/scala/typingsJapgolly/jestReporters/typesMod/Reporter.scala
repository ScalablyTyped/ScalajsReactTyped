package typingsJapgolly.jestReporters.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def getLastError(): js.Error | Unit
  def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit
  def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit
  def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit
  def onTestStart(test: Test): js.Promise[Unit] | Unit
}

object Reporter {
  @scala.inline
  def apply(
    getLastError: CallbackTo[js.Error | Unit],
    onRunComplete: (Set[Context], AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => CallbackTo[js.Promise[Unit] | Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onTestStart: Test => CallbackTo[js.Promise[Unit] | Unit]
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLastError")(getLastError.toJsFn)
    __obj.updateDynamic("onRunComplete")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.jestReporters.typesMod.Context], t1: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onRunComplete(t0, t1).runNow()))
    __obj.updateDynamic("onRunStart")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => onRunStart(t0, t1).runNow()))
    __obj.updateDynamic("onTestResult")(js.Any.fromFunction3((t0: typingsJapgolly.jestReporters.typesMod.Test, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestResult(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTestStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Test) => onTestStart(t0).runNow()))
    __obj.asInstanceOf[Reporter]
  }
}

