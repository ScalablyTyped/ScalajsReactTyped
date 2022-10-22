package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskRegistration extends StObject {
  
  var name: String
  
  var oncompleted: Any
  
  var onprogress: Any
  
  var taskId: String
  
  def unregister(cancelTask: Boolean): Unit
}
object IBackgroundTaskRegistration {
  
  inline def apply(name: String, oncompleted: Any, onprogress: Any, taskId: String, unregister: Boolean => Callback): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1((t0: Boolean) => unregister(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
  
  extension [Self <: IBackgroundTaskRegistration](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOncompleted(value: Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    inline def setOnprogress(value: Any): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: Boolean => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
