package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTaskResponse extends StObject {
  
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.undefined
}
object StopTaskResponse {
  
  inline def apply(): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTaskResponse]
  }
  
  extension [Self <: StopTaskResponse](x: Self) {
    
    inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
