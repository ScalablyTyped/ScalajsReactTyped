package typingsJapgolly.jestWatcher.jestHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestWatcher.jestWatcherStrings.onFileChange
  - typingsJapgolly.jestWatcher.jestWatcherStrings.onTestRunComplete
  - typingsJapgolly.jestWatcher.jestWatcherStrings.shouldRunTestSuite
*/
trait AvailableHooks extends js.Object

object AvailableHooks {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onFileChange: typingsJapgolly.jestWatcher.jestWatcherStrings.onFileChange = this.cast("onFileChange")
  @scala.inline
  def onTestRunComplete: typingsJapgolly.jestWatcher.jestWatcherStrings.onTestRunComplete = this.cast("onTestRunComplete")
  @scala.inline
  def shouldRunTestSuite: typingsJapgolly.jestWatcher.jestWatcherStrings.shouldRunTestSuite = this.cast("shouldRunTestSuite")
}

