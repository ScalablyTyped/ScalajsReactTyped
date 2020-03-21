package typingsJapgolly.jestReporters.defaultReporterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.baseReporterMod.BaseReporter
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestReporters.typesMod.Test
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultReporter extends BaseReporter {
  var _bufferedOutput: js.Any
  var _clear: js.Any
  var _clearStatus: js.Any
  var _err: js.Any
  var _globalConfig: GlobalConfig
  var _out: js.Any
  var _printStatus: js.Any
  var _status: js.Any
  var _wrapStdio: js.Any
  def forceFlushBufferedOutput(): Unit
  def onRunComplete(): Unit
  def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit
  def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit
  def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit
}

object DefaultReporter {
  @scala.inline
  def apply(
    _bufferedOutput: js.Any,
    _clear: js.Any,
    _clearStatus: js.Any,
    _err: js.Any,
    _globalConfig: GlobalConfig,
    _out: js.Any,
    _printStatus: js.Any,
    _setError: js.Error => Callback,
    _status: js.Any,
    _wrapStdio: js.Any,
    forceFlushBufferedOutput: Callback,
    getLastError: CallbackTo[js.Error | Unit],
    log: String => Callback,
    onRunComplete: Callback,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => CallbackTo[js.Promise[Unit] | Unit],
    onTestResult: (Test, TestResult, AggregatedResult) => CallbackTo[js.Promise[Unit] | Unit],
    onTestStart: Test => CallbackTo[js.Promise[Unit] | Unit],
    printTestFileFailureMessage: (Path, ProjectConfig, TestResult) => Callback,
    printTestFileHeader: (Path, ProjectConfig, TestResult) => Callback,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Callback,
    _error: js.Any = null
  ): DefaultReporter = {
    val __obj = js.Dynamic.literal(_bufferedOutput = _bufferedOutput.asInstanceOf[js.Any], _clear = _clear.asInstanceOf[js.Any], _clearStatus = _clearStatus.asInstanceOf[js.Any], _err = _err.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _out = _out.asInstanceOf[js.Any], _printStatus = _printStatus.asInstanceOf[js.Any], _status = _status.asInstanceOf[js.Any], _wrapStdio = _wrapStdio.asInstanceOf[js.Any])
    __obj.updateDynamic("_setError")(js.Any.fromFunction1((t0: js.Error) => _setError(t0).runNow()))
    __obj.updateDynamic("forceFlushBufferedOutput")(forceFlushBufferedOutput.toJsFn)
    __obj.updateDynamic("getLastError")(getLastError.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("onRunComplete")(onRunComplete.toJsFn)
    __obj.updateDynamic("onRunStart")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => onRunStart(t0, t1).runNow()))
    __obj.updateDynamic("onTestResult")(js.Any.fromFunction3((t0: typingsJapgolly.jestReporters.typesMod.Test, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestResult(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTestStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Test) => onTestStart(t0).runNow()))
    __obj.updateDynamic("printTestFileFailureMessage")(js.Any.fromFunction3((t0: typingsJapgolly.jestTypes.configMod.Path, t1: typingsJapgolly.jestTypes.configMod.ProjectConfig, t2: typingsJapgolly.jestTestResult.typesMod.TestResult) => printTestFileFailureMessage(t0, t1, t2).runNow()))
    __obj.updateDynamic("printTestFileHeader")(js.Any.fromFunction3((t0: typingsJapgolly.jestTypes.configMod.Path, t1: typingsJapgolly.jestTypes.configMod.ProjectConfig, t2: typingsJapgolly.jestTestResult.typesMod.TestResult) => printTestFileHeader(t0, t1, t2).runNow()))
    __obj.updateDynamic("testFinished")(js.Any.fromFunction3((t0: typingsJapgolly.jestTypes.configMod.ProjectConfig, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => testFinished(t0, t1, t2).runNow()))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultReporter]
  }
}

