package typingsJapgolly.jestJasmine2.reporterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestJasmine2.specMod.SpecResult
import typingsJapgolly.jestJasmine2.suiteMod.SuiteResult
import typingsJapgolly.jestJasmine2.typesMod.Reporter
import typingsJapgolly.jestJasmine2.typesMod.RunDetails
import typingsJapgolly.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine2Reporter extends Reporter {
  var _addMissingMessageToStack: js.Any
  var _config: js.Any
  var _currentSuites: js.Any
  var _extractSpecResults: js.Any
  var _globalConfig: js.Any
  var _resolve: js.Any
  var _resultsPromise: js.Any
  var _startTimes: js.Any
  var _testPath: js.Any
  var _testResults: js.Any
  def getResults(): js.Promise[TestResult]
}

object Jasmine2Reporter {
  @scala.inline
  def apply(
    _addMissingMessageToStack: js.Any,
    _config: js.Any,
    _currentSuites: js.Any,
    _extractSpecResults: js.Any,
    _globalConfig: js.Any,
    _resolve: js.Any,
    _resultsPromise: js.Any,
    _startTimes: js.Any,
    _testPath: js.Any,
    _testResults: js.Any,
    getResults: CallbackTo[js.Promise[TestResult]],
    jasmineDone: RunDetails => Callback,
    jasmineStarted: RunDetails => Callback,
    specDone: SpecResult => Callback,
    specStarted: SpecResult => Callback,
    suiteDone: SuiteResult => Callback,
    suiteStarted: SuiteResult => Callback
  ): Jasmine2Reporter = {
    val __obj = js.Dynamic.literal(_addMissingMessageToStack = _addMissingMessageToStack.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _currentSuites = _currentSuites.asInstanceOf[js.Any], _extractSpecResults = _extractSpecResults.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], _resultsPromise = _resultsPromise.asInstanceOf[js.Any], _startTimes = _startTimes.asInstanceOf[js.Any], _testPath = _testPath.asInstanceOf[js.Any], _testResults = _testResults.asInstanceOf[js.Any])
    __obj.updateDynamic("getResults")(getResults.toJsFn)
    __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineDone(t0).runNow()))
    __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.typesMod.RunDetails) => jasmineStarted(t0).runNow()))
    __obj.updateDynamic("specDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specDone(t0).runNow()))
    __obj.updateDynamic("specStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => specStarted(t0).runNow()))
    __obj.updateDynamic("suiteDone")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteDone(t0).runNow()))
    __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.suiteMod.SuiteResult) => suiteStarted(t0).runNow()))
    __obj.asInstanceOf[Jasmine2Reporter]
  }
}

