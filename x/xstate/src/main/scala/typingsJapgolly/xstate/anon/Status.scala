package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libBehaviorsMod.PromiseState
import typingsJapgolly.xstate.xstateStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with PromiseState[Any] {
  
  var data: Unit
  
  var error: Unit
  
  var status: pending
}
object Status {
  
  inline def apply(data: Unit, error: Unit): Status = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "pending")
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
