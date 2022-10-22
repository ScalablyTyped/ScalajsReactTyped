package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskCompletedEventArgs extends StObject {
  
  def checkResult(): Unit
  
  var instanceId: String
}
object IBackgroundTaskCompletedEventArgs {
  
  inline def apply(checkResult: Callback, instanceId: String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.toJsFn, instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
  
  extension [Self <: IBackgroundTaskCompletedEventArgs](x: Self) {
    
    inline def setCheckResult(value: Callback): Self = StObject.set(x, "checkResult", value.toJsFn)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
  }
}
