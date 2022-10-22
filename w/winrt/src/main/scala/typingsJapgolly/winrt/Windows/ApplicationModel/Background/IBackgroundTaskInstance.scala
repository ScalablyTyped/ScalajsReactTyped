package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskInstance extends StObject {
  
  def getDeferral(): BackgroundTaskDeferral
  
  var instanceId: String
  
  var oncanceled: Any
  
  var progress: Double
  
  var suspendedCount: Double
  
  var task: BackgroundTaskRegistration
  
  var triggerDetails: Any
}
object IBackgroundTaskInstance {
  
  inline def apply(
    getDeferral: CallbackTo[BackgroundTaskDeferral],
    instanceId: String,
    oncanceled: Any,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
  
  extension [Self <: IBackgroundTaskInstance](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[BackgroundTaskDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setOncanceled(value: Any): Self = StObject.set(x, "oncanceled", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setSuspendedCount(value: Double): Self = StObject.set(x, "suspendedCount", value.asInstanceOf[js.Any])
    
    inline def setTask(value: BackgroundTaskRegistration): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTriggerDetails(value: Any): Self = StObject.set(x, "triggerDetails", value.asInstanceOf[js.Any])
  }
}
