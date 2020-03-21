package typingsJapgolly.jestReporters.coverageReporterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMap
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

trait CoverageReporter extends BaseReporter {
  var _addUntestedFiles: js.Any
  var _checkThreshold: js.Any
  var _coverageMap: js.Any
  var _globalConfig: js.Any
  var _options: js.Any
  var _sourceMapStore: js.Any
  def getCoverageMap(): CoverageMap
}

object CoverageReporter {
  @scala.inline
  def apply(
    _addUntestedFiles: js.Any,
    _checkThreshold: js.Any,
    _coverageMap: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _setError: js.Error => Callback,
    _sourceMapStore: js.Any,
    getCoverageMap: CallbackTo[CoverageMap],
    getLastError: CallbackTo[js.Error | Unit],
    log: String => Callback,
    onRunComplete: (Set[Context], AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => CallbackTo[js.Promise[Unit] | Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onTestStart: Test => CallbackTo[js.Promise[Unit] | Unit],
    _error: js.Any = null
  ): CoverageReporter = {
    val __obj = js.Dynamic.literal(_addUntestedFiles = _addUntestedFiles.asInstanceOf[js.Any], _checkThreshold = _checkThreshold.asInstanceOf[js.Any], _coverageMap = _coverageMap.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _sourceMapStore = _sourceMapStore.asInstanceOf[js.Any])
    __obj.updateDynamic("_setError")(js.Any.fromFunction1((t0: js.Error) => _setError(t0).runNow()))
    __obj.updateDynamic("getCoverageMap")(getCoverageMap.toJsFn)
    __obj.updateDynamic("getLastError")(getLastError.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("onRunComplete")(js.Any.fromFunction2((t0: typingsJapgolly.std.Set[typingsJapgolly.jestReporters.typesMod.Context], t1: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onRunComplete(t0, t1).runNow()))
    __obj.updateDynamic("onRunStart")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => onRunStart(t0, t1).runNow()))
    __obj.updateDynamic("onTestResult")(js.Any.fromFunction3((t0: typingsJapgolly.jestReporters.typesMod.Test, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestResult(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTestStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Test) => onTestStart(t0).runNow()))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageReporter]
  }
}

