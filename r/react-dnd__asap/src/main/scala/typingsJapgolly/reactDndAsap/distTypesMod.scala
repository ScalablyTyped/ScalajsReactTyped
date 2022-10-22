package typingsJapgolly.reactDndAsap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Task extends StObject {
    
    def call(): Unit
  }
  object Task {
    
    inline def apply(call: Callback): Task = {
      val __obj = js.Dynamic.literal(call = call.toJsFn)
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setCall(value: Callback): Self = StObject.set(x, "call", value.toJsFn)
    }
  }
  
  type TaskFn = js.Function0[Unit]
}
