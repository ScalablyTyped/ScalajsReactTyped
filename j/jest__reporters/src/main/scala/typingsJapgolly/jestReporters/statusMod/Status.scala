package typingsJapgolly.jestReporters.statusMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.AnonClear
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var _aggregatedResults: js.UndefOr[js.Any] = js.undefined
  var _cache: js.Any
  var _callback: js.UndefOr[js.Any] = js.undefined
  var _currentTests: js.Any
  var _debouncedEmit: js.Any
  var _done: js.Any
  var _emit: js.Any
  var _emitScheduled: js.Any
  var _estimatedTime: js.Any
  var _interval: js.UndefOr[js.Any] = js.undefined
  var _showStatus: js.Any
  var _tick: js.Any
  def get(): AnonClear
  def onChange(callback: js.Function0[Unit]): Unit
  def runFinished(): Unit
  def runStarted(aggregatedResults: AggregatedResult, options: ReporterOnStartOptions): Unit
  def testFinished(_config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit
  def testStarted(testPath: Path, config: ProjectConfig): Unit
}

object Status {
  @scala.inline
  def apply(
    _cache: js.Any,
    _currentTests: js.Any,
    _debouncedEmit: js.Any,
    _done: js.Any,
    _emit: js.Any,
    _emitScheduled: js.Any,
    _estimatedTime: js.Any,
    _showStatus: js.Any,
    _tick: js.Any,
    get: CallbackTo[AnonClear],
    onChange: js.Function0[Unit] => Callback,
    runFinished: Callback,
    runStarted: (AggregatedResult, ReporterOnStartOptions) => Callback,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Callback,
    testStarted: (Path, ProjectConfig) => Callback,
    _aggregatedResults: js.Any = null,
    _callback: js.Any = null,
    _interval: js.Any = null
  ): Status = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _currentTests = _currentTests.asInstanceOf[js.Any], _debouncedEmit = _debouncedEmit.asInstanceOf[js.Any], _done = _done.asInstanceOf[js.Any], _emit = _emit.asInstanceOf[js.Any], _emitScheduled = _emitScheduled.asInstanceOf[js.Any], _estimatedTime = _estimatedTime.asInstanceOf[js.Any], _showStatus = _showStatus.asInstanceOf[js.Any], _tick = _tick.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onChange(t0).runNow()))
    __obj.updateDynamic("runFinished")(runFinished.toJsFn)
    __obj.updateDynamic("runStarted")(js.Any.fromFunction2((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult, t1: typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions) => runStarted(t0, t1).runNow()))
    __obj.updateDynamic("testFinished")(js.Any.fromFunction3((t0: typingsJapgolly.jestTypes.configMod.ProjectConfig, t1: typingsJapgolly.jestTestResult.typesMod.TestResult, t2: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => testFinished(t0, t1, t2).runNow()))
    __obj.updateDynamic("testStarted")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.Path, t1: typingsJapgolly.jestTypes.configMod.ProjectConfig) => testStarted(t0, t1).runNow()))
    if (_aggregatedResults != null) __obj.updateDynamic("_aggregatedResults")(_aggregatedResults.asInstanceOf[js.Any])
    if (_callback != null) __obj.updateDynamic("_callback")(_callback.asInstanceOf[js.Any])
    if (_interval != null) __obj.updateDynamic("_interval")(_interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

