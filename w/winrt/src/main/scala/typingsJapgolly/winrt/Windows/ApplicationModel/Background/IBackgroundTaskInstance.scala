package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskInstance extends js.Object {
  var instanceId: String
  var oncanceled: js.Any
  var progress: Double
  var suspendedCount: Double
  var task: BackgroundTaskRegistration
  var triggerDetails: js.Any
  def getDeferral(): BackgroundTaskDeferral
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: CallbackTo[BackgroundTaskDeferral],
    instanceId: String,
    oncanceled: js.Any,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
}

