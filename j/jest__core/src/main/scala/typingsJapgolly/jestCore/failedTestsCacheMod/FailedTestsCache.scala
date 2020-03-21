package typingsJapgolly.jestCore.failedTestsCacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestRunner.mod.Test
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedTestsCache extends js.Object {
  var _enabledTestsMap: js.UndefOr[js.Any] = js.undefined
  def filterTests(tests: js.Array[Test]): js.Array[Test]
  def setTestResults(testResults: js.Array[TestResult]): Unit
  def updateConfig(globalConfig: GlobalConfig): GlobalConfig
}

object FailedTestsCache {
  @scala.inline
  def apply(
    filterTests: js.Array[Test] => CallbackTo[js.Array[Test]],
    setTestResults: js.Array[TestResult] => Callback,
    updateConfig: GlobalConfig => CallbackTo[GlobalConfig],
    _enabledTestsMap: js.Any = null
  ): FailedTestsCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterTests")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.jestRunner.mod.Test]) => filterTests(t0).runNow()))
    __obj.updateDynamic("setTestResults")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.jestTestResult.typesMod.TestResult]) => setTestResults(t0).runNow()))
    __obj.updateDynamic("updateConfig")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig) => updateConfig(t0).runNow()))
    if (_enabledTestsMap != null) __obj.updateDynamic("_enabledTestsMap")(_enabledTestsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedTestsCache]
  }
}

