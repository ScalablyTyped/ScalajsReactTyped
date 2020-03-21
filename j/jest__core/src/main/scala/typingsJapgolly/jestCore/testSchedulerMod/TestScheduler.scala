package typingsJapgolly.jestCore.testSchedulerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestReporters.typesMod.Reporter
import typingsJapgolly.jestRunner.mod.Test
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler extends js.Object {
  var _addCustomReporters: js.Any
  var _bailIfNeeded: js.Any
  var _context: js.Any
  var _dispatcher: js.Any
  /**
    * Get properties of a reporter in an object
    * to make dealing with them less painful.
    */
  var _getReporterProps: js.Any
  var _globalConfig: js.Any
  var _options: js.Any
  var _partitionTests: js.Any
  var _setupDefaultReporters: js.Any
  var _setupReporters: js.Any
  var _shouldAddDefaultReporters: js.Any
  def addReporter(reporter: Reporter): Unit
  def removeReporter(ReporterClass: js.Function): Unit
  def scheduleTests(tests: js.Array[Test], watcher: typingsJapgolly.jestCore.testWatcherMod.default): js.Promise[AggregatedResult]
}

object TestScheduler {
  @scala.inline
  def apply(
    _addCustomReporters: js.Any,
    _bailIfNeeded: js.Any,
    _context: js.Any,
    _dispatcher: js.Any,
    _getReporterProps: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _partitionTests: js.Any,
    _setupDefaultReporters: js.Any,
    _setupReporters: js.Any,
    _shouldAddDefaultReporters: js.Any,
    addReporter: Reporter => Callback,
    removeReporter: js.Function => Callback,
    scheduleTests: (js.Array[Test], typingsJapgolly.jestCore.testWatcherMod.default) => CallbackTo[js.Promise[AggregatedResult]]
  ): TestScheduler = {
    val __obj = js.Dynamic.literal(_addCustomReporters = _addCustomReporters.asInstanceOf[js.Any], _bailIfNeeded = _bailIfNeeded.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _dispatcher = _dispatcher.asInstanceOf[js.Any], _getReporterProps = _getReporterProps.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _partitionTests = _partitionTests.asInstanceOf[js.Any], _setupDefaultReporters = _setupDefaultReporters.asInstanceOf[js.Any], _setupReporters = _setupReporters.asInstanceOf[js.Any], _shouldAddDefaultReporters = _shouldAddDefaultReporters.asInstanceOf[js.Any])
    __obj.updateDynamic("addReporter")(js.Any.fromFunction1((t0: typingsJapgolly.jestReporters.typesMod.Reporter) => addReporter(t0).runNow()))
    __obj.updateDynamic("removeReporter")(js.Any.fromFunction1((t0: js.Function) => removeReporter(t0).runNow()))
    __obj.updateDynamic("scheduleTests")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.jestRunner.mod.Test], t1: typingsJapgolly.jestCore.testWatcherMod.default) => scheduleTests(t0, t1).runNow()))
    __obj.asInstanceOf[TestScheduler]
  }
}

