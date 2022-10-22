package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  def callback(timeStamp: Double): scala.Unit
  
  var cancelled: Boolean
  
  var id: TaskID
}
object Task {
  
  inline def apply(callback: Double => japgolly.scalajs.react.Callback, cancelled: Boolean, id: TaskID): Task = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: Double) => callback(t0).runNow()), cancelled = cancelled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setCallback(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setId(value: TaskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
