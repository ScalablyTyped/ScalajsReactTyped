package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskDeferral extends js.Object {
  def complete(): Unit
}

object IBackgroundTaskDeferral {
  @scala.inline
  def apply(complete: Callback): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
}

