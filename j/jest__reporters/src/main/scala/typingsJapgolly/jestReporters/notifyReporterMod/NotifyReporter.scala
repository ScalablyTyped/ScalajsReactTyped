package typingsJapgolly.jestReporters.notifyReporterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.baseReporterMod.BaseReporter
import typingsJapgolly.jestReporters.typesMod.Context
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestReporters.typesMod.Test
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReporter extends BaseReporter {
  var _context: js.Any
  var _globalConfig: js.Any
  var _startRun: js.Any
}

object NotifyReporter {
  @scala.inline
  def apply(
    _context: js.Any,
    _globalConfig: js.Any,
    _setError: js.Error => Callback,
    _startRun: js.Any,
    getLastError: CallbackTo[js.Error | Unit],
    log: String => Callback,
    onRunComplete: (Set[Context], AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => CallbackTo[js.Promise[Unit] | Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onTestStart: Test => CallbackTo[js.Promise[Unit] | Unit],
    _error: js.Any = null
  ): NotifyReporter = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _startRun = _startRun.asInstanceOf[js.Any])
    __obj.updateDynamic("_setError")(js.Any.fromFunction1((t0: js.Error) => _setError(t0).runNow()))
    __obj.updateDynamic("getLastError")(getLastError.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("onRunComplete")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.jestReporters.typesMod.Context], t1: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onRunComplete(t0, t1).runNow()))
    __obj.updateDynamic("onRunStart")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => onRunStart(t0, t1).runNow()))
    __obj.updateDynamic("onTestResult")(js.Any.fromFunction3((t0: typingsJapgolly.jestReporters.typesMod.Test, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestResult(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTestStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Test) => onTestStart(t0).runNow()))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyReporter]
  }
}

