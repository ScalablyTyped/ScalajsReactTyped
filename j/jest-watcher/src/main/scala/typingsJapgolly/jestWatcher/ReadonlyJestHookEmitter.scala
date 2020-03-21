package typingsJapgolly.jestWatcher

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestWatcher.typesMod.JestHookExposedFS
import typingsJapgolly.jestWatcher.typesMod.TestSuiteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookEmitter> */
trait ReadonlyJestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit
  def onTestRunComplete(results: AggregatedResult): Unit
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean]
}

object ReadonlyJestHookEmitter {
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Callback,
    onTestRunComplete: AggregatedResult => Callback,
    shouldRunTestSuite: TestSuiteInfo => CallbackTo[js.Promise[Boolean]]
  ): ReadonlyJestHookEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFileChange")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.JestHookExposedFS) => onFileChange(t0).runNow()))
    __obj.updateDynamic("onTestRunComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => onTestRunComplete(t0).runNow()))
    __obj.updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.TestSuiteInfo) => shouldRunTestSuite(t0).runNow()))
    __obj.asInstanceOf[ReadonlyJestHookEmitter]
  }
}

