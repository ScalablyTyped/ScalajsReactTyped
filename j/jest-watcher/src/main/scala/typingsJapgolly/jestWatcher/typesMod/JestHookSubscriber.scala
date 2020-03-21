package typingsJapgolly.jestWatcher.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookSubscriber extends js.Object {
  def onFileChange(fn: FileChange): Unit
  def onTestRunComplete(fn: TestRunComplete): Unit
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
}

object JestHookSubscriber {
  @scala.inline
  def apply(
    onFileChange: FileChange => Callback,
    onTestRunComplete: TestRunComplete => Callback,
    shouldRunTestSuite: ShouldRunTestSuite => Callback
  ): JestHookSubscriber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFileChange")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.FileChange) => onFileChange(t0).runNow()))
    __obj.updateDynamic("onTestRunComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.TestRunComplete) => onTestRunComplete(t0).runNow()))
    __obj.updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.ShouldRunTestSuite) => shouldRunTestSuite(t0).runNow()))
    __obj.asInstanceOf[JestHookSubscriber]
  }
}

