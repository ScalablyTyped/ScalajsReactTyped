package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskDeferral
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.BackgroundTaskRegistration
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUIBackgroundTaskInstanceRuntimeClass
  extends StObject
     with IWebUIBackgroundTaskInstance
     with IBackgroundTaskInstance
object WebUIBackgroundTaskInstanceRuntimeClass {
  
  inline def apply(
    getDeferral: CallbackTo[BackgroundTaskDeferral],
    instanceId: String,
    oncanceled: Any,
    progress: Double,
    succeeded: Boolean,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: Any
  ): WebUIBackgroundTaskInstanceRuntimeClass = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIBackgroundTaskInstanceRuntimeClass]
  }
}
