package typingsJapgolly.jestCore.snapshotInteractiveModeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.AssertionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotInteractiveMode extends js.Object {
  var _clearTestSummary: js.Any
  var _countPaths: js.Any
  var _drawUIDone: js.Any
  var _drawUIDoneWithSkipped: js.Any
  var _drawUIOverlay: js.Any
  var _drawUIProgress: js.Any
  var _isActive: js.Any
  var _pipe: js.Any
  var _run: js.Any
  var _skippedNum: js.Any
  var _testAssertions: js.Any
  var _updateTestRunnerConfig: js.Any
  def abort(): Unit
  def getSkippedNum(): Double
  def isActive(): Boolean
  def put(key: String): Unit
  def restart(): Unit
  def run(
    failedSnapshotTestAssertions: js.Array[AssertionLocation],
    onConfigChange: js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, _]
  ): Unit
  def updateWithResults(results: AggregatedResult): Unit
}

object SnapshotInteractiveMode {
  @scala.inline
  def apply(
    _clearTestSummary: js.Any,
    _countPaths: js.Any,
    _drawUIDone: js.Any,
    _drawUIDoneWithSkipped: js.Any,
    _drawUIOverlay: js.Any,
    _drawUIProgress: js.Any,
    _isActive: js.Any,
    _pipe: js.Any,
    _run: js.Any,
    _skippedNum: js.Any,
    _testAssertions: js.Any,
    _updateTestRunnerConfig: js.Any,
    abort: Callback,
    getSkippedNum: CallbackTo[Double],
    isActive: CallbackTo[Boolean],
    put: String => Callback,
    restart: Callback,
    run: (js.Array[AssertionLocation], js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, js.Any]) => Callback,
    updateWithResults: AggregatedResult => Callback
  ): SnapshotInteractiveMode = {
    val __obj = js.Dynamic.literal(_clearTestSummary = _clearTestSummary.asInstanceOf[js.Any], _countPaths = _countPaths.asInstanceOf[js.Any], _drawUIDone = _drawUIDone.asInstanceOf[js.Any], _drawUIDoneWithSkipped = _drawUIDoneWithSkipped.asInstanceOf[js.Any], _drawUIOverlay = _drawUIOverlay.asInstanceOf[js.Any], _drawUIProgress = _drawUIProgress.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _pipe = _pipe.asInstanceOf[js.Any], _run = _run.asInstanceOf[js.Any], _skippedNum = _skippedNum.asInstanceOf[js.Any], _testAssertions = _testAssertions.asInstanceOf[js.Any], _updateTestRunnerConfig = _updateTestRunnerConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("getSkippedNum")(getSkippedNum.toJsFn)
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: java.lang.String) => put(t0).runNow()))
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.jestTestResult.typesMod.AssertionLocation], t1: js.Function2[
  /* assertion */ typingsJapgolly.jestTestResult.typesMod.AssertionLocation | scala.Null, 
  /* shouldUpdateSnapshot */ scala.Boolean, 
  js.Any]) => run(t0, t1).runNow()))
    __obj.updateDynamic("updateWithResults")(js.Any.fromFunction1((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => updateWithResults(t0).runNow()))
    __obj.asInstanceOf[SnapshotInteractiveMode]
  }
}

