package typingsJapgolly.jestWatcher

import japgolly.scalajs.react.Callback
import typingsJapgolly.jestWatcher.typesMod.FileChange
import typingsJapgolly.jestWatcher.typesMod.ShouldRunTestSuite
import typingsJapgolly.jestWatcher.typesMod.TestRunComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookSubscriber> */
trait ReadonlyJestHookSubscribe extends js.Object {
  def onFileChange(fn: FileChange): Unit
  def onTestRunComplete(fn: TestRunComplete): Unit
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
}

object ReadonlyJestHookSubscribe {
  @scala.inline
  def apply(
    onFileChange: FileChange => Callback,
    onTestRunComplete: TestRunComplete => Callback,
    shouldRunTestSuite: ShouldRunTestSuite => Callback
  ): ReadonlyJestHookSubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFileChange")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.FileChange) => onFileChange(t0).runNow()))
    __obj.updateDynamic("onTestRunComplete")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.TestRunComplete) => onTestRunComplete(t0).runNow()))
    __obj.updateDynamic("shouldRunTestSuite")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.ShouldRunTestSuite) => shouldRunTestSuite(t0).runNow()))
    __obj.asInstanceOf[ReadonlyJestHookSubscribe]
  }
}

