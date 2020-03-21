package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTask extends js.Object {
  def run(taskInstance: IBackgroundTaskInstance): Unit
}

object IBackgroundTask {
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Callback): IBackgroundTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance) => run(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTask]
  }
}

