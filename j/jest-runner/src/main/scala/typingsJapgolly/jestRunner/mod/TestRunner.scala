package typingsJapgolly.jestRunner.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunner extends js.Object {
  var _context: js.Any
  var _createInBandTestRun: js.Any
  var _createParallelTestRun: js.Any
  var _globalConfig: js.Any
  def runTests(
    tests: js.Array[typingsJapgolly.jestRunner.typesMod.Test],
    watcher: typingsJapgolly.jestRunner.typesMod.TestWatcher,
    onStart: typingsJapgolly.jestRunner.typesMod.OnTestStart,
    onResult: typingsJapgolly.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsJapgolly.jestRunner.typesMod.OnTestFailure,
    options: typingsJapgolly.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit]
}

object TestRunner {
  @scala.inline
  def apply(
    _context: js.Any,
    _createInBandTestRun: js.Any,
    _createParallelTestRun: js.Any,
    _globalConfig: js.Any,
    runTests: (js.Array[typingsJapgolly.jestRunner.typesMod.Test], typingsJapgolly.jestRunner.typesMod.TestWatcher, typingsJapgolly.jestRunner.typesMod.OnTestStart, typingsJapgolly.jestRunner.typesMod.OnTestSuccess, typingsJapgolly.jestRunner.typesMod.OnTestFailure, typingsJapgolly.jestRunner.typesMod.TestRunnerOptions) => CallbackTo[js.Promise[Unit]]
  ): TestRunner = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _createInBandTestRun = _createInBandTestRun.asInstanceOf[js.Any], _createParallelTestRun = _createParallelTestRun.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("runTests")(js.Any.fromFunction6((t0: js.Array[typingsJapgolly.jestRunner.typesMod.Test], t1: typingsJapgolly.jestRunner.typesMod.TestWatcher, t2: typingsJapgolly.jestRunner.typesMod.OnTestStart, t3: typingsJapgolly.jestRunner.typesMod.OnTestSuccess, t4: typingsJapgolly.jestRunner.typesMod.OnTestFailure, t5: typingsJapgolly.jestRunner.typesMod.TestRunnerOptions) => runTests(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[TestRunner]
  }
}

