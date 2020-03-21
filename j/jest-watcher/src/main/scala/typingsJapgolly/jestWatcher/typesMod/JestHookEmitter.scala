package typingsJapgolly.jestWatcher.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit
  def onTestRunComplete(results: AggregatedResult): Unit
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean]
}

object JestHookEmitter {
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Callback,
    onTestRunComplete: AggregatedResult => Callback,
    shouldRunTestSuite: TestSuiteInfo => CallbackTo[js.Promise[Boolean]]
  ): JestHookEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFileChange")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.JestHookExposedFS) => onFileChange(t0).runNow()))
    __obj.updateDynamic("onTestRunComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestRunComplete(t0).runNow()))
    __obj.updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.TestSuiteInfo) => shouldRunTestSuite(t0).runNow()))
    __obj.asInstanceOf[JestHookEmitter]
  }
}

