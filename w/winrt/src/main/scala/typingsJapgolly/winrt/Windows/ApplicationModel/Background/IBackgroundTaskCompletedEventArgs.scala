package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskCompletedEventArgs extends js.Object {
  var instanceId: String
  def checkResult(): Unit
}

object IBackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: Callback, instanceId: String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("checkResult")(checkResult.toJsFn)
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
}

