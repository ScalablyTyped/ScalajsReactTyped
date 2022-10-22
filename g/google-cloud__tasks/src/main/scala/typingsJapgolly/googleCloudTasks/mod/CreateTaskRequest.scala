package typingsJapgolly.googleCloudTasks.mod

import typingsJapgolly.googleCloudTasks.anon.PartialTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskRequest extends StObject {
  
  var parent: String
  
  var responseView: js.UndefOr[View] = js.undefined
  
  var task: PartialTask
}
object CreateTaskRequest {
  
  inline def apply(parent: String, task: PartialTask): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  
  extension [Self <: CreateTaskRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setResponseView(value: View): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
    
    inline def setTask(value: PartialTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
  }
}
